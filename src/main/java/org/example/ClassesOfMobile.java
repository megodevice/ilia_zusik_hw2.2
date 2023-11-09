package org.example;

public enum ClassesOfMobile {
    LAPTOP("Laptop"), MP3PLAYER("MP3 Player"), SMARTPHONE("Smartphone");

    private String type;
    ClassesOfMobile(String type) {
        this.type = type;
    }
    public String getText() {
        return type;
    }

}

