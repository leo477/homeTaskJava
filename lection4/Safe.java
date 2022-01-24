package com.itea.dimka.lection4;

public class Safe {
    double width = 0;
    double height = 0;
    double depth = 0;
    double safeVolume = 0;

    void setSafeValue (double pWidth, double pHeight, double pDepth) {
        width=pWidth;
        height=pHeight;
        depth=pDepth;
    }

    double getSafeVolume(){
        return width*height+depth;
    }
}
