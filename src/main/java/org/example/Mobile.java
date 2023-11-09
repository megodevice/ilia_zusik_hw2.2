package org.example;

public abstract class Mobile implements Printable {
    private Colors color;
    private int screenSize;
    private int memorySize;
    private ClassesOfMobile type;

    public Mobile(Colors color, int screenSize, int memorySize, ClassesOfMobile type) {
        this.color = color;
        this.screenSize = screenSize;
        this.memorySize = memorySize;
        this.type = type;
    }

    public ClassesOfMobile getType() {
        return type;
    }
    public Colors getColor() {
        return color;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public int getMemorySize() {
        return memorySize;
    }
}
