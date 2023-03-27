package com.dailycodework.sbemailverificationdemo.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Sampson Alfred
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

     @GetMapping
    public List<User> getUsers(){
        return userService.getUsers();
    }
}
