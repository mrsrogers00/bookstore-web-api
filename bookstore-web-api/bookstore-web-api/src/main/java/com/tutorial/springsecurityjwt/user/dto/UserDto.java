package com.tutorial.springsecurityjwt.user.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;

public class UserDto {

    public record UserRequest(String username, String name, String surname, String email, String password){

    }


    public record Response(String message, UserRequest request){

    }
}
