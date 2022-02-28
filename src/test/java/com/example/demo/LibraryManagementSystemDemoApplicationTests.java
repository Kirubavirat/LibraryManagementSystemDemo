package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.librarymanagementsystem.entity.Books;
import com.example.demo.librarymanagementsystem.repository.BookRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class LibraryManagementSystemDemoApplicationTests {
	
	
	@Test
	void contextLoads() {
		
	}
	
	@Autowired
	BookRepository bookrepository;
	@Test
	void saveBooksTest() {
		Books books = new Books(20,"html","Scarian","hijk",200,120);
		bookrepository.save(books);
		boolean actualResult = bookrepository.existsById(20);
		Assertions.assertTrue(actualResult);
		
	}
	
	@Test
	void updateBooksTest() {
		Books books = new Books(20,"mangodb","Scarian","hijk",200,120);
		bookrepository.save(books);
		boolean actualResult = bookrepository.existsById(20);
		Assertions.assertTrue(actualResult);
		
	}
	
	
	@Test
	void deleteBooksTest() {
		Books books = new Books(4,"JavaScript","Radley","hijk",400,100);
		bookrepository.delete(books);
		boolean actualResult = bookrepository.existsById(4);
		Assertions.assertFalse(actualResult);
		
	}

}
