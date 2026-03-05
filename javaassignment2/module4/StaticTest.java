/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaassignment2.module4;
class StaticDemo {
    static int count = 0;

    StaticDemo() {
        count++;
    }

    static void displayCount() {
        System.out.println("Count: " + count);
    }
}

public class StaticTest {
    public static void main(String[] args) {
        new StaticDemo();
        new StaticDemo();
        new StaticDemo();

        StaticDemo.displayCount();
    }
}
