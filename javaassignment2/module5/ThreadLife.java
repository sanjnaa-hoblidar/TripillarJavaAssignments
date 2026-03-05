/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaassignment2.module5;
public class ThreadLife extends Thread {

    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) throws InterruptedException {

        ThreadLife t = new ThreadLife();

        System.out.println("State after creation: " + t.getState());

        t.start();
        System.out.println("State after start: " + t.getState());

        t.join();
        System.out.println("State after completion: " + t.getState());
    }
}
