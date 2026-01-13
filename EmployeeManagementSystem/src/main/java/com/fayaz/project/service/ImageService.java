package com.fayaz.project.service;

import java.util.List;

import com.fayaz.project.entity.Image;

public interface ImageService {

    Image saveImage(Image image);

    List<Image> getAllImages();
}