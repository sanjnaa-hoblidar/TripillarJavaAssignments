/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaassignment2.module5;

/**
 *
 * @author user
 */
public class DeadlockDemoExample {
 

    static final Object lock1 = new Object();
    static final Object lock2 = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread1 locked lock1");
                synchronized (lock2) {
                    System.out.println("Thread1 locked lock2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread2 locked lock2");
                synchronized (lock1) {
                    System.out.println("Thread2 locked lock1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}