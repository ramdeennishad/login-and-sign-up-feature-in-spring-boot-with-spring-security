package com.reglogin.service;

import com.reglogin.dto.UserDto;
import com.reglogin.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);
    User findUserByEmail(String email);
    List<UserDto> findAllUsers();
}
