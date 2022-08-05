package com.autoflex.tms.services;

import com.autoflex.tms.dto.userDto.CreateUserDto;
import com.autoflex.tms.dto.userDto.GetAllUserDto;
import com.autoflex.tms.mappers.Mapper;
import com.autoflex.tms.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void createUser(CreateUserDto userdto) {
        userRepository.save(Mapper.convertToUser(userdto));
    }

    @Override
    public void update(CreateUserDto userdto, String email) {
        userRepository.deleteByEmail(email);
        userRepository.save(Mapper.convertToUser(userdto));
    }

    @Override
    public GetAllUserDto getByEmail(String email) {
        return Mapper.convertToGetAllUserDto(userRepository.findByEmail(email));
    }

    @Override
    public void remove(String email) {
        userRepository.deleteByEmail(email);
    }


    @Override
    public List<GetAllUserDto> findAll() {
        return userRepository.findAll().stream()
                .map(Mapper::convertToGetAllUserDto)
                .collect(Collectors.toList());
    }

}