package com.example.codeclan.FileManager;

import com.example.codeclan.FileManager.models.File;
import com.example.codeclan.FileManager.models.Folder;
import com.example.codeclan.FileManager.models.User;
import com.example.codeclan.FileManager.repositories.FileRepository;
import com.example.codeclan.FileManager.repositories.FolderRepository;
import com.example.codeclan.FileManager.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FileManagerApplicationTests {


	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void addToDatabase(){
		File audio = new File("audio", ".wav", 20);
		fileRepository.save(audio);
		File video = new File("video", ".mp4", 53);
		fileRepository.save(video);
		Folder vids = new Folder("vids");
		folderRepository.save(vids);
		Folder tunes = new Folder("tunes");
		folderRepository.save(tunes);
		User user = new User("Susan");
		userRepository.save(user);
	}

}
