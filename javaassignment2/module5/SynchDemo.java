/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaassignment2.module5;

/**
 *
 * @author user
 */

class Counter {
    int count = 0;

    synchronized void increment() {
        count++;
    }
}

public class SynchDemo {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                c.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                c.increment();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + c.count);
    }
}
    