/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaassignment2.module4;
public class StringReverse {
    public static void main(String[] args) {
        String input = "Sanjana";
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        System.out.println("Reversed String: " + sb);
    }
}
