package org.example;

public class Smartphone extends Mobile {
    private int countOfCameras;
    private int megapixels;

    public Smartphone(Colors color, int screenSize, int memorySize, int countOfCameras, int megapixels) {
        super(color, screenSize, memorySize, ClassesOfMobile.SMARTPHONE);
        this.countOfCameras = countOfCameras;
        this.megapixels = megapixels;
    }

    public int getCountOfCameras() {
        return countOfCameras;
    }

    public int getMegapixels() {
        return megapixels;
    }

    @Override
    public void print() {
        System.out.println("Type: " + super.getType().getText() + "\n" +
                "Color: " + super.getColor().getText() + "\n" +
                "Screen size: " + super.getScreenSize() + "\"\n" +
                "Memory: " + super.getScreenSize() + "GB\n" +
                "Cameras: " + countOfCameras + " (" + megapixels + " megapixel)");
    }
}
