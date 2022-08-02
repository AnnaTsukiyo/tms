package com.autoflex.tms.services;

import com.autoflex.tms.dto.UserDto;

import java.util.List;

public interface UserService {
    void createUser(UserDto userdto);
    void update (UserDto userdto, String email);
//    void remove (String email);
   UserDto getByEmail(String email);
    List<UserDto> findAll();
}
