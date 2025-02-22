package com.example.springboot.service;

import com.example.springboot.controller.reques.UserPageRequest;
import com.example.springboot.entity.User;

import java.util.List;

public interface IUserService {
    List<User> list();

    Object page(UserPageRequest userPageRequest);
}
