package com.example.codeclan.FileManager.repositories;

import com.example.codeclan.FileManager.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
