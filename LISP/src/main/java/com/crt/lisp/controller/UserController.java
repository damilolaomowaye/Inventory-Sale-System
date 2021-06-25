package com.crt.lisp.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crt.lisp.entity.TheLogConverter;
import com.crt.lisp.entity.User;
import com.crt.lisp.service.UserLogService;
import com.crt.lisp.service.UserService;

@RestController
@RequestMapping("users")
public class UserController {
	
	@Autowired UserService userService;
	@Autowired UserLogService userLogService;
	
	@RequestMapping("")
    public Iterable<User> getAllUsers() {
        return userService.findAll();
    }
	
	
	@RequestMapping("/{id}")
    public Optional<User> searchUser(@PathVariable int id) {
        return userService.find(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "")
    public void addUser(@RequestBody User user) {
        userService.insert(user);
        userLogService.insert(TheLogConverter.userLogConverter(user));
    }

    @RequestMapping(method = RequestMethod.PUT,value ="/{id}")
    public void updateUser(@RequestBody User user) {
        userService.updateUser(user);
        userLogService.insert(TheLogConverter.userLogConverter(user));
    }

    @RequestMapping(method = RequestMethod.DELETE,value ="/{id}")
    public void deleteUser(@RequestBody User user) {
        userService.deleteUser(user);
        userLogService.insert(TheLogConverter.userLogConverter(user));
    }


}
