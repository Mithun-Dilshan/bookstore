package com.ijse.bookstore.Repositary;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ijse.bookstore.Entity.Book;


@Repository

public interface BookRepositary extends JpaRepository<Book,Long> {

    
    
}
