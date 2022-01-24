package com.itea.dimka.lection6;

public class Box {
    private int width;
    private int height;
    private int depth;

    Box() {
        width = 10;
        height = 10;
        depth = 10;
    }

    Box(int width, int h, int d) {
        this.width = width;
        this.height = h;
        this.depth = d;
    }

    Box(int width, int h) {
/*        this.width = width;
        this.height = h;
        this.depth = 20;*/
        //new Box(width,height,20);
        this(width, h, 20);
    }

    Box(int len) {
        width = height = depth = len; // this(len,len,len);
    }

    /*
        void setParams(int ww; int h; int d){
            width=ww;
            height=h;
            depth=d;
        }
     */
    int getVolume() {
        return width * height * depth;
    }

    Box (Box ob){
        width=ob.width;
        height=ob.height;
        depth=ob.depth;
    }

    public static void main(String[] args) {
        Box defaultBox = new Box();
        System.out.println("V = " + defaultBox.getVolume());
        Box carBox = new Box(100, 200, 200);
        System.out.println("V = " + carBox.getVolume());
        Box cube = new Box(5);
        int vol=cube.getVolume();
        System.out.println("V = " + vol);
        Box bigBox = new Box(20,5,1);
        Box cloneBox = new Box(bigBox);
    }
}
