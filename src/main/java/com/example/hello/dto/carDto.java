package com.example.hello.dto;

public class carDto {
    private String name;
    private String number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "carDto{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
