package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Book;

@RestController
public class BookController {

    @GetMapping("/books")
    public List<Book> getBooks() {

        return Arrays.asList(

                new Book(
                        101,
                        "Java Programming",
                        "James Gosling"
                ),

                new Book(
                        102,
                        "Effective Java",
                        "Joshua Bloch"
                ),

                new Book(
                        103,
                        "Clean Code",
                        "Robert C. Martin"
                ),

                new Book(
                        104,
                        "Spring in Action",
                        "Craig Walls"
                ),

                new Book(
                        105,
                        "Head First Java",
                        "Kathy Sierra"
                ),

                new Book(
                        106,
                        "Data Structures and Algorithms",
                        "Narasimha Karumanchi"
                ),

                new Book(
                        107,
                        "Java: The Complete Reference",
                        "Herbert Schildt"
                ),

                new Book(
                        108,
                        "Core Java Volume I",
                        "Cay S. Horstmann"
                ),

                new Book(
                        109,
                        "Design Patterns",
                        "Erich Gamma"
                ),

                new Book(
                        110,
                        "Refactoring",
                        "Martin Fowler"
                )

        );
    }
}