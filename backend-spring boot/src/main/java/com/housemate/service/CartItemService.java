package com.housemate.service;

import com.housemate.exception.CartItemException;
import com.housemate.exception.UserException;
import com.housemate.model.Cart;
import com.housemate.model.CartItem;
import com.housemate.model.Product;


public interface CartItemService {
	
	public CartItem updateCartItem(Long userId, Long id,CartItem cartItem) throws CartItemException, UserException;
	
	public void removeCartItem(Long userId,Long cartItemId) throws CartItemException, UserException;
	
	public CartItem findCartItemById(Long cartItemId) throws CartItemException;
	
}
