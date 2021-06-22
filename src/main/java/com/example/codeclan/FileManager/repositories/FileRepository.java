package com.example.codeclan.FileManager.repositories;

import com.example.codeclan.FileManager.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
