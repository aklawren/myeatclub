package com.gearlaunch.myeatclub.model;

import java.util.List;

/**
 */
public class Cart {

    public Long cartId;

    public List<MenuItem> cartItems;

    public User user;
 


    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public List<MenuItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<MenuItem> cartItems) {
        this.cartItems = cartItems;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
