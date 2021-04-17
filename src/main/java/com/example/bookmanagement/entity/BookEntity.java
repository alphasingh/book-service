package com.example.bookmanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


//@Entity
//@Table(
//        name = "books_details")
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Data
public class BookEntity {

    private Long id;

    private String title;

    private String author;

    private Long price;

    private String isbn;

}
