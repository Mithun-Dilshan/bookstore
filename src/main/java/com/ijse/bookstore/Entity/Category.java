package com.ijse.bookstore.Entity;



import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name ="categares")
@Data

public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  id;
    @Column(nullable = false)
    private String cname;

     @Column(nullable = false)
    private String cdescription;

    @OneToMany(mappedBy = "category")
    private List<Book> books;

    @OneToMany(mappedBy = "category")
    private List<SubCategory> subcategories;

    // @OneToMany(targetEntity = Book.class,cascade = CascadeType.ALL)
    // @JoinColumn(name ="book_id",referencedColumnName = "id")
    // private List<Book> books;


  

    
}
