package com.company;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2.0);
        shapes[1] = new Rectangle(2.0, 3.0);
        shapes[2]=new Square(4.0);
        double random=Math.random()*100;
        System.out.println("random"+random);
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].resize(random);
            shapes[i].getArea();
        }

    }
}
