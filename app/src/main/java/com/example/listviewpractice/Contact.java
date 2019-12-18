package com.example.listviewpractice;

public class Contact {

    private String name;
    private String number;
    private int image;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public Contact(String name, String number, int image) {
        this.setName(name);
        this.setNumber(number);
        this.setImage(image);
    }

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

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
