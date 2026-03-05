/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaassignment2.module4;
interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class UpiPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
}

public class PaymentTest {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new UpiPayment();

        p1.pay(1000);
        p2.pay(500);
    }
}
