package com.company.fourclasswork.bookstore;

public class Book {
    private String title;
    private int year;
    private Author author;

    public Book() {
    }

    public Book(String title, int year, Author author , String authorName, String authorCountry) {
        this.title = title;
        this.year = year;
        this.author = author;
        author.setCountry(authorCountry);
        author.setName(authorName);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void displayBookInfo() {
        System.out.println("Book title: " + this.title +
                "\n Book year released: " + this.year +
                "\n Book Author name:" + this.author.getName() +
                "\n Book author country of birth:" + this.author.getCountry()
        );
    }


}