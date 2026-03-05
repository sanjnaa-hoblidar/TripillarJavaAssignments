/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaassignment2.module4;
public class DemoString {
    public static void main(String[] args) {

        // String (Immutable)
        String str = "Hello";
        str = str + " World";
        System.out.println("String: " + str);

        // StringBuilder (Not Thread Safe)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder: " + sb);

        // StringBuffer (Thread Safe)
        StringBuffer sf = new StringBuffer("Hello");
        sf.append(" World");
        System.out.println("StringBuffer: " + sf);
    }
}

