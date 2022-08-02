package com.autoflex.tms.services;

import com.autoflex.tms.dto.UserDto;
import com.autoflex.tms.mappers.Mapper;
import com.autoflex.tms.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Resource
    private Mapper mapper;

    @Override
    public void createUser(UserDto userdto) {
        userRepository.save(Mapper.convertToUser(userdto));
    }

    @Override
    public void update(UserDto userdto, String email) {
        // todo update;
    }

    @Override
    public UserDto getByEmail(String email) {
        return Mapper.convertToUserDto(userRepository.findByEmail(email));
    }

    @Override
    public List<UserDto> findAll() {
        return userRepository.findAll().stream()
                .map(Mapper::convertToUserDto)
                .collect(Collectors.toList());
    }

}