package com.gearlaunch.myeatclub.service;

import com.gearlaunch.myeatclub.Repository;
import com.gearlaunch.myeatclub.model.Cart;
import com.gearlaunch.myeatclub.model.MenuItem;
import com.gearlaunch.myeatclub.model.Order;
import com.gearlaunch.myeatclub.model.User;

import java.util.Arrays;
import java.util.List;

/**
 * Created by m308707 on 10/17/17.
 */
public class OrderServiceImpl implements OrderService{

    /* Assumptions:
     *
     */
    public Repository repository = Repository.getInstance();

    /**
     * Create a cart model object for the user. The given menu item is the first menu item in this cart.
     * The cart is associated with/owned by the user.
     *
     * @param user
     * @param menuItem
     * @return an instance of @{@link Cart} object.
     */
    public Cart createCart(User user, MenuItem menuItem){
        Cart cart = new Cart();
        cart.setUser(user);
        cart.setCartItems(Arrays.asList(menuItem));
        repository.createCart(cart);
        return cart;
    }

    /**
     * Add a new menu item in the cart.
     *
     * @param cartId
     * @param user
     * @param menuItem
     * @return
     */
    public Cart addMenuItem(Long cartId, User user, MenuItem menuItem){
        Cart cart = repository.getCart(cartId);
        List<MenuItem> cartItems = cart.getCartItems();

        cartItems.add(menuItem);
        cart.setCartItems(cartItems);

        repository.updateCart(cartId, cart);
        return cart;
    }

    /**
     * Remove a menu item from the cart.
     * @param cartId
     * @param user
     * @param menuItem
     * @return
     */
    public Cart removeMenuItem(Long cartId, User user, MenuItem menuItem){
        Cart cart = repository.getCart(cartId);
        List<MenuItem> cartItems = cart.getCartItems();

        cartItems.remove(menuItem);
        cart.setCartItems(cartItems);

        repository.updateCart(cartId, cart);
        return cart;
    }

    /**
     * Delete a cart.
     * @param cartId
     * @param user
     */
    public void deleteCart(Long cartId, User user){
        repository.deleteCart(cartId);
    }

    /**
     * Create an order from a cart.
     * @param cartId
     * @param user
     * @return
     */
    public Order checkoutCart(Long cartId, User user){
        //TODO: Implement :)
        // We should associate a payment with a cart to create an order
    }
}
