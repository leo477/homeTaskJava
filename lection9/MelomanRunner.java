package com.itea.dimka.lection9;

public class MelomanRunner {
    public static void main(String[] args) {
        MusicStyle ms = MusicStyle.CLASSIC;
        System.out.print(ms);
        switch (ms) {
            case JAZZ:
                System.out.println(" is Jazz");
                break;
            case CLASSIC:
                System.out.println(" is Classic");
                break;
            case ROCK:
                System.out.println(" is Rock");
                break;
            default:
                System.out.println(" Unknown music style: " + ms);
        }

        double shape = Shape.RECTANGLE.defineSquare2(2.0, 2.0);
        System.out.println(shape);
    }
}
