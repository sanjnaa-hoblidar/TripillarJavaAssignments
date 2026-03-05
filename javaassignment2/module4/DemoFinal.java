/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaassignment2.module4;
class FinalDemo {
    final int number = 10;  // final variable

    final void show() {     // final method
        System.out.println("Final method");
    }
}

final class FinalClass {    // final class
    void display() {
        System.out.println("Final class example");
    }
}

public class DemoFinal {
    public static void main(String[] args) {
        FinalDemo obj = new FinalDemo();
        obj.show();
        System.out.println("Final Variable: " + obj.number);

        FinalClass fc = new FinalClass();
        fc.display();
    }
}
