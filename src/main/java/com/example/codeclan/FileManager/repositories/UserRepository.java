package com.example.codeclan.FileManager.repositories;

import com.example.codeclan.FileManager.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
