package com.ijse.bookstore.Service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.ijse.bookstore.Entity.Book;


@Service

public interface BookService {
    List<Book> getAllBook();
    Book getBookById(Long Id);
    Book creatBook(Book book);
    Book updateBook(Long id, Book book);
    void deleteBook (Long id);

    
}
