package com.credits.consumer.mappers;

import com.credits.consumer.dto.request.UserReq;
import com.credits.consumer.entity.User;

public class UserDetailsMap {

    public static User convertToUser(UserReq userReq){
        User user = new User();
        user.setId(userReq.getId());
        return user;
    }
}
