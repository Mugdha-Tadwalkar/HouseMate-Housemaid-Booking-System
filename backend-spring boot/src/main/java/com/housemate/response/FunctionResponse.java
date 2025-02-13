package com.housemate.response;

import com.housemate.dto.OrderHistory;
import com.housemate.model.Cart;
import com.housemate.model.Order;
import com.housemate.model.Product;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FunctionResponse {
    private String functionName;
    private Cart userCart;
    private OrderHistory orderHistory;
    private Product product;
}
