package com.gearlaunch.myeatclub.model;

/**
 */
public class Order {
    public Cart cart;

    public Payment payment;

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
