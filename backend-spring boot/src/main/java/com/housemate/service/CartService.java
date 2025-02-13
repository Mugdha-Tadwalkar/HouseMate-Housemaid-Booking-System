package com.housemate.service;

import com.housemate.exception.ProductException;
import com.housemate.model.Cart;
import com.housemate.model.CartItem;
import com.housemate.model.Product;
import com.housemate.model.User;
import com.housemate.request.AddItemRequest;

public interface CartService {
	
	public CartItem addCartItem(User user,
								Product product,
								String size,
								int quantity) throws ProductException;
	
	public Cart findUserCart(User user);

}
