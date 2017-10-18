package com.gearlaunch.myeatclub.service;

import com.gearlaunch.myeatclub.model.Cart;
import com.gearlaunch.myeatclub.model.MenuItem;
import com.gearlaunch.myeatclub.model.Order;
import com.gearlaunch.myeatclub.model.User;

/**
 */
public interface OrderService {

	/**
	 * Create a cart model object for the user. The given menu item is the first menu item in this cart.
	 * The cart is associated with/owned by the user.
	 *
	 * @param user
	 * @param menuItem
	 * @return an instance of @{@link Cart} object.
	 */
	Cart createCart(User user, MenuItem menuItem);

	/**
	 * Add a new menu item in the cart.
	 *
	 * @param cartId
	 * @param user
	 * @param menuItem
	 * @return
	 */
	Cart addMenuItem(Long cartId, User user, MenuItem menuItem);

	/**
	 * Remove a menu item from the cart.
	 * @param cartId
	 * @param user
	 * @param menuItem
	 * @return
	 */
	Cart removeMenuItem(Long cartId, User user, MenuItem menuItem);

	/**
	 * Delete a cart.
	 * @param cartId
	 * @param user
	 */
	void deleteCart(Long cartId, User user);

	/**
	 * Create an order from a cart.
	 * @param cartId
	 * @param user
	 * @return
	 */
	Order checkoutCart(Long cartId, User user);
}
