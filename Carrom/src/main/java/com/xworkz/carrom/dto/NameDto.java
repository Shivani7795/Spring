package com.xworkz.carrom.dto;

import jdk.nashorn.internal.objects.annotations.Getter;

import java.io.Serializable;

public class NameDto implements Serializable {

    private String firstName;
    private String middleName;
    private String lastName;

    public NameDto() {
        System.out.println("Created NameDto");
    }

    public NameDto(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "NameDto [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + "]";
    }
}
