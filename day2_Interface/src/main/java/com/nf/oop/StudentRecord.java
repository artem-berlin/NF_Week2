package com.nf.oop;

public record StudentRecord(String firstname, String lastname, int id) {

    public StudentRecord changeFirstName(String newFirstname) {
        return new StudentRecord(newFirstname, lastname, id);
    }
}
