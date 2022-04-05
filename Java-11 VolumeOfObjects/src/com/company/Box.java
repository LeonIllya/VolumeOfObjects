package com.company;

public class Box {
   double width;
   double length;
   double height;


    Box(double newWidth, double newLength, double newHeight) {
         width = newWidth;
         length = newLength;
         height = newHeight;
    }

    double getVolume(){
        return width*length*height;
    }

}
