/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaassignment2.module5;
// Using Thread class
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread using Thread class");
    }
}

// Using Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread using Runnable interface");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();

        Thread t2 = new Thread(new MyRunnable());
        t2.start();
    }
}
