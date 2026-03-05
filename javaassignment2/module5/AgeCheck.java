/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaassignment2.module5;
class AgeException extends Exception {
    AgeException(String msg) {
        super(msg);
    }
}

public class AgeCheck {
    static void validate(int age) throws AgeException {
        if (age < 18)
            throw new AgeException("Age must be 18 or above");
        else
            System.out.println("Eligible");
    }

    public static void main(String[] args) {
        try {
            validate(16);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
