package com.company;

public class Main {

    public static void main(String[] args) {
        Box object1 = new Box(2.5,3.5,2.3);
        Box object2 = new Box( 2.1,6.5,4.3);
        Box object3 = new Box(5.6,2.7,2.2);
        Box object4 = new Box(6,7,8);
        Box object5 = new Box(3,2,1);

        System.out.println("Обьем 1 коробки: " +object1.getVolume());
        System.out.println("Обьем 2 коробки: " +object2.getVolume());
        System.out.println("Обьем 3 коробки: " +object3.getVolume());
        System.out.println("Обьем 4 коробки: " +object4.getVolume());
        System.out.println("Обьем 5 коробки: " +object5.getVolume());
    }
}
