package com.example.bookrecommendation.dto;

public class BookRequest {
    String favBook;
    String genre;
    String author;

    public String getFavBook() {
        return favBook;
    }

    public void setFavBook(String favBook) {
        this.favBook = favBook;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
