/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaassignment2.module5;

import java.io.*;

public class ExceptionDemo {
    public static void main(String[] args) {

        // Unchecked Exception
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception: " + e);
        }

        // Checked Exception
        try {
            FileReader file = new FileReader("test.txt");
        } catch (IOException e) {
            System.out.println("Checked Exception: " + e);
        }
    }
}
    