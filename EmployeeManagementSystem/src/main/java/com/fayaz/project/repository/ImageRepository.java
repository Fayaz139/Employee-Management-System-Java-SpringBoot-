package com.fayaz.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fayaz.project.entity.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
	
}