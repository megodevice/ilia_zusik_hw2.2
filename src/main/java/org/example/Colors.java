package org.example;

public enum Colors {
    RED("Red"), GREEN("Green"), BLACK("Black"), WHITE("White");
    private String color;
    Colors(String color) {
        this.color = color;
    }
    public String getText() {
        return color;
    }
}
