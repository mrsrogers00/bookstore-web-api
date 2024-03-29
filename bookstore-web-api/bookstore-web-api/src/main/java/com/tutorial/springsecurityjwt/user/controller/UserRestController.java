package com.tutorial.springsecurityjwt.user.controller;

import com.tutorial.springsecurityjwt.auth.AuthDTO;
import com.tutorial.springsecurityjwt.user.dto.UserDto;
import com.tutorial.springsecurityjwt.user.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@Validated
public class UserRestController {

    @Autowired
    UserServiceImp userService;

    @PostMapping()
    public ResponseEntity<?> signUp(@RequestBody UserDto.UserRequest userLogin) throws IllegalAccessException{
        UserDto.UserRequest user = userService.saveUserInformation(userLogin);

        UserDto.Response response = new UserDto.Response("User logged in successfully", user);
        return ResponseEntity.ok(response);
    }
}
