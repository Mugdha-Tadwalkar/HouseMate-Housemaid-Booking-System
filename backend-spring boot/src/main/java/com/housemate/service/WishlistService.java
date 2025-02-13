package com.housemate.service;


import com.housemate.exception.WishlistNotFoundException;
import com.housemate.model.Product;
import com.housemate.model.User;
import com.housemate.model.Wishlist;

import java.util.Optional;

public interface WishlistService {

    Wishlist createWishlist(User user);

    Wishlist getWishlistByUserId(User user);

    Wishlist addProductToWishlist(User user, Product product) throws WishlistNotFoundException;

}

