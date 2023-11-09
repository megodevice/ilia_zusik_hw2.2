package org.example;

public class Main {
    public static void main(String[] args) {
        Printable[] printables = {createObject(ClassesOfMobile.MP3PLAYER), createObject(ClassesOfMobile.SMARTPHONE), createObject(ClassesOfMobile.LAPTOP)};
        System.out.println("-------------------------------------------");
        for (Printable printable : printables) {
            if (printable != null) {
                printable.print();
                System.out.println("-------------------------------------------");
            }
        }
    }

    public static Printable createObject(ClassesOfMobile type) {
        switch (type) {
            case LAPTOP -> {
                return new Laptop(Colors.BLACK, 16, 256, "i3-6100U", 2500, "MX110");
            }
            case SMARTPHONE -> {
                return new Smartphone(Colors.RED, 6, 64, 2, 40);
            }
            case MP3PLAYER -> {
                return new MP3Player(Colors.WHITE, 2, 16, 14);
            }
            default -> {
                return null;
            }
        }
    }
}