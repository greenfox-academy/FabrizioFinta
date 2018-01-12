package com.greenfox.casino.services;

import com.greenfox.casino.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
  
  private List<User> users;
  
  public UserService(){
    users = new ArrayList<>();
  }
  
  public User login(User user){
    if(users.contains(user)) {
      return user;
    } else {
      return null;
    }
  }
    
    public void register(User user){
      users.add(user);
    }
  
  public List<User> getUsers() {
    return users;
  }
}
