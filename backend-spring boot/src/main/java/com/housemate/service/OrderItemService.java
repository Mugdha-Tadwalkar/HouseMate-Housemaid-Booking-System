package com.housemate.service;


import com.housemate.exception.OrderException;
import com.housemate.model.OrderItem;
import com.housemate.model.Product;

public interface OrderItemService {

	OrderItem getOrderItemById(Long id) throws Exception;
	


}
