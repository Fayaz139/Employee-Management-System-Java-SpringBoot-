package com.fayaz.project.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.fayaz.project.entity.Image;
import com.fayaz.project.service.ImageService;

@Controller
public class ImageController {

    // Folder where images will be stored
    private static final String UPLOAD_DIR = "src/main/resources/static/uploads/";

    private final ImageService imageService;

    @Autowired
    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }

    // SHOW IMAGE UPLOAD PAGE
    @GetMapping("/more/image-upload")
    public String showImageUploadPage(Model model) {
        List<Image> images = imageService.getAllImages();
        model.addAttribute("images", images);
        return "more/image-upload";
    }

    // HANDLE IMAGE UPLOAD
    @PostMapping("/more/image-upload")
    public String uploadImage(
            @RequestParam("imageFile") MultipartFile file,
            @RequestParam("imageName") String imageName) {

        try {
            // Ensure upload directory exists
            Files.createDirectories(Paths.get(UPLOAD_DIR));

            // Original file name
            String originalFileName = file.getOriginalFilename();

            // Build full path
            Path filePath = Paths.get(UPLOAD_DIR + originalFileName);

            // Save file to disk
            Files.write(filePath, file.getBytes());

            // Save image info to DB
            Image image = new Image();
            image.setFileName(imageName);
            image.setFilePath("/uploads/" + originalFileName);

            imageService.saveImage(image);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "redirect:/more/image-upload";
    }
}