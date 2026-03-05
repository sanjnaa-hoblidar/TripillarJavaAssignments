/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaassignment2.module4;

/**
 *
 * @author user
 */

abstract class shape2 {
    abstract double area();
}

class Circle extends shape2 {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends shape2 {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    double area() {
        return length * width;
    }
}

public class TestShape {
    public static void main(String[] args) {
        shape2 c = new Circle(5);
        shape2 r = new Rectangle(4, 6);

        System.out.println("Circle Area: " + c.area());
        System.out.println("Rectangle Area: " + r.area());
    }
}
    