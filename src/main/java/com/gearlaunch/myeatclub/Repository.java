package com.gearlaunch.myeatclub;

import com.gearlaunch.myeatclub.model.Cart;
import com.gearlaunch.myeatclub.model.User;

import java.util.Map;

/**
 * Singleton class to manage our user/cart datastore.
 * Created by m308707 on 10/17/17.
 */
public class Repository {
    private Map<Long, Cart> datastore;

    private static Repository instance;

    private Long originalCartId = new Long(0);

    private Repository(){}

    public static Repository getInstance(){
        if(instance == null){
            return new Repository();
        }
        else{
            return instance;
        }
    }
    /**
     * Updates the cart object for a given user in our datastore.
     *
     * @param user
     * @param cart
     */
    public void updateCart(Long cartId, Cart cart){
        if(datastore.containsKey(cartId)){
            datastore.put(cartId,cart);
        }
    }

    /**
     * Creates a cart object for a given user, overriding any that already exist.
     *
     * @param cart
     */
    public Long createCart(Cart cart){
        Long cartId = generateCartId();
        cart.setCartId(cartId);
        datastore.put(cartId, cart);
        return cartId;
    }

    /**
     * Updates the cart object for a given user in our datastore.
     *
     * @param cartId
     * @return cart if it exists, otherwise null
     */
    public Cart getCart(Long cartId){
        try{
            return datastore.get(cartId);
        }
        catch(Exception e){
            return null;
        }
    }

    /**
     * Deletes a cart object if it exists
     *
     * @param cartId
     */
    public void deleteCart(Long cartId){
        datastore.remove(cartId);
    }


    private Long generateCartId(){
        originalCartId = originalCartId + 1;
        return originalCartId;
    }

}
