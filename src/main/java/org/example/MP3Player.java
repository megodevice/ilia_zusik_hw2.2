package org.example;

public class MP3Player extends Mobile {
    private int hoursOfPlay;

    public int getHoursOfPlay() {
        return hoursOfPlay;
    }

    public MP3Player(Colors color, int screenSize, int memorySize, int hoursOfPlay) {
        super(color, screenSize, memorySize, ClassesOfMobile.MP3PLAYER);
        this.hoursOfPlay = hoursOfPlay;
    }

    @Override
    public void print() {
        System.out.println("Type: " + super.getType().getText() + "\n" +
                "Color: " + super.getColor().getText() + "\n" +
                "Screen size: " + super.getScreenSize() + "\"\n" +
                "Memory: " + super.getScreenSize() + "GB\n" +
                "Hours of playing: " + hoursOfPlay);
    }
}
