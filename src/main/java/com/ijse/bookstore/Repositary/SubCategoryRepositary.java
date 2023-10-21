package com.ijse.bookstore.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ijse.bookstore.Entity.SubCategory;


@Repository



public interface SubCategoryRepositary extends JpaRepository<SubCategory,Long> {

    
    
}
