package com.itea.dimka.lection4;

public class Point {
    private int x, y;

    private boolean visibility;

    void createPoint(int a, int b){
        x=a;
        y=b;
        visibility=true;
    }
    void setVisibility(boolean visibility){
        this.visibility=visibility;
    }
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
}
