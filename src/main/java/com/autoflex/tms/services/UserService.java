package com.autoflex.tms.services;

import com.autoflex.tms.dto.userDto.CreateUserDto;
import com.autoflex.tms.dto.userDto.GetAllUserDto;

import java.util.List;

public interface UserService {
    void createUser(CreateUserDto userdto);
    void update (CreateUserDto userdto, String email);
    void remove (String email);
   GetAllUserDto getByEmail(String email);
    List<GetAllUserDto> findAll();
}
