package com.umca.study;

import com.umca.study.repository.BookRepository;
import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudyApplication {

	private final BookRepository bookRepository;

	public StudyApplication(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(StudyApplication.class, args);
	}

	public void createBook(Map<String, Object> body){
		bookRepository.save(body);
	}
}
