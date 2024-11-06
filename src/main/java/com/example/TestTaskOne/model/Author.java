package com.example.TestTaskOne.model;

import java.util.Objects;

public class Author {
    private int id;
    private String name;
    private String surName;
    private int dateOfBirth;
    private Book book;

    public Author(String name, String surName, int dateOfBirth) {
        this.name = name;
        this.surName = surName;
        this.dateOfBirth = dateOfBirth;
    }
    public Author(int id, String name, String surName, int dateOfBirth, Book book) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.dateOfBirth = dateOfBirth;
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Book getBook() {
        return book;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return id == author.id && dateOfBirth == author.dateOfBirth && Objects.equals(name, author.name) && Objects.equals(surName, author.surName) && Objects.equals(book, author.book);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surName, dateOfBirth, book);
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", book=" + book +
                '}';
    }
}
