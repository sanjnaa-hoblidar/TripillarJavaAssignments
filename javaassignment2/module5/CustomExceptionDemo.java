/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaassignment2.module5;
class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {

    static void check(int num) throws MyException {
        if (num < 0)
            throw new MyException("Number is negative");
        else
            System.out.println("Number is positive");
    }

    public static void main(String[] args) {
        try {
            check(-5);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
