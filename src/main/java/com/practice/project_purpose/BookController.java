package com.practice.project_purpose;

public class BookController {
    public static void main(String[] args) {
        try {
            BookService bookService = new BookService();
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
