package com.housemate.mapper;

import com.housemate.dto.OrderDto;
import com.housemate.dto.OrderItemDto;
import com.housemate.dto.UserDto;
import com.housemate.model.Order;
import com.housemate.model.OrderItem;
import com.housemate.model.User;

public class UserMapper {

    public static UserDto toUserDto(User user){
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFullName(user.getFullName());
        userDto.setEmail(user.getEmail());
        return userDto;
    }

}
