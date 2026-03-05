/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaassignment2.module4;
public class DemoGarbage {
    public void finalize() {
        System.out.println("Object is garbage collected");
    }

    public static void main(String[] args) {
       DemoGarbage obj1 = new DemoGarbage();
        DemoGarbage obj2 = new DemoGarbage();

        obj1 = null;
        obj2 = null;

        System.gc();
    }
}
