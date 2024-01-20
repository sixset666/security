package com.example.springsecurity.Controller;

import com.example.springsecurity.Dto.UserDto;
import com.example.springsecurity.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    @GetMapping
    public String registerForm(){
        return "registration";
    }

    @PostMapping
    public String registerUser(UserDto userDto){
        userService.registration(userDto);
        return "redirect:/login";
    }
}
