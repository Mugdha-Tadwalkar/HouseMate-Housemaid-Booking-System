package com.housemate.controller;

import com.housemate.exception.CartItemException;
import com.housemate.exception.UserException;
import com.housemate.model.CartItem;
import com.housemate.model.User;
import com.housemate.response.ApiResponse;
import com.housemate.service.CartItemService;
import com.housemate.service.UserService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cart_items")
public class CartItemController {

	private CartItemService cartItemService;
	private UserService userService;
	
	public CartItemController(CartItemService cartItemService, UserService userService) {
		this.cartItemService=cartItemService;
		this.userService=userService;
	}
	

}
