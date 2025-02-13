package com.housemate.service;

import java.util.List;

import com.housemate.exception.UserException;
import com.housemate.model.User;

public interface UserService {

	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public User findUserByEmail(String email) throws UserException;


}
