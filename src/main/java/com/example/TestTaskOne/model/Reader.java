package com.example.TestTaskOne.model;

import java.util.Objects;

public class Reader extends Author {
    int numberPhone;
    String gender;

    public Reader(String name, String surName, int dateOfBirth, int numberPhone, String gender) {
        super(name, surName, dateOfBirth);
        this.numberPhone = numberPhone;
        this.gender = gender;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Reader reader = (Reader) o;
        return numberPhone == reader.numberPhone && Objects.equals(gender, reader.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberPhone, gender);
    }

    @Override
    public String toString() {
        return "Reader{" +
                "numberPhone=" + numberPhone +
                ", gender='" + gender + '\'' +
                '}';
    }
}
