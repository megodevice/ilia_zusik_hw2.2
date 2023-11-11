package org.example;

public class Laptop extends Mobile {
    private String modelOfCPU;
    private int frequency;
    private String modelOfGraphics;

    public String getModelOfCPU() {
        return modelOfCPU;
    }

    public int getFrequency() {
        return frequency;
    }

    public String getModelOfGraphics() {
        return modelOfGraphics;
    }

    public Laptop(Colors color, int screenSize, int memorySize, String modelOfCPU, int frequency, String modelOfGraphics) {
        super(color, screenSize, memorySize, ClassesOfMobile.LAPTOP);
        this.modelOfCPU = modelOfCPU;
        this.frequency = frequency;
        this.modelOfGraphics = modelOfGraphics;
    }

    @Override
    public void print() {
        System.out.println("Type: " + super.getType().getText() + "\n" +
                "Color: " + super.getColor().getText() + "\n" +
                "Screen size: " + super.getScreenSize() + "\"\n" +
                "Memory: " + super.getMemorySize() + "GB\n" +
                "CPU: " + modelOfCPU + " (" + frequency + "Mhz)\n" +
                "Graphics: " + modelOfGraphics);
    }
}
