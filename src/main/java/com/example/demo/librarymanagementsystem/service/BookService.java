package com.example.demo.librarymanagementsystem.service;

import java.util.List;



import com.example.demo.librarymanagementsystem.entity.Books;


public interface BookService {
	 List<Books> getAllBooks();
	 void saveBooks(Books books);
	 Books getBooksById(int id);
	 void deleteBooksById(int id);
		
	

}