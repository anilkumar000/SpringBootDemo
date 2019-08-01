package com.stackroute.userservice.service;

import com.stackroute.userservice.domain.User;
import com.stackroute.userservice.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
  UserRepository userRepository;

  @Override
  public User saveUser(User user) {
   User savedUser= userRepository.save(user);
    return savedUser;
  }

  @Override
  public User getUserById(int id) {
    return userRepository.findById(id).get();
  }

}
