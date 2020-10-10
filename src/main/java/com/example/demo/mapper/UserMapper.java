package com.example.demo.mapper;

import java.util.HashMap;
import java.util.Map;
import com.example.demo.domain.User;

public class UserMapper {
    private static Map<Integer,User> userMap = new HashMap<>();
    static{
        userMap.put(1,new User(1,"jack","123"));
        userMap.put(2,new User(2,"tom","123"));
        userMap.put(3,new User(3,"kitty","123"));

    }

}
