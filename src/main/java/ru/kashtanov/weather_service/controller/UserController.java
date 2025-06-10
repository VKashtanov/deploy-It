package ru.kashtanov.weather_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.kashtanov.weather_service.models.User;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class UserController {

    @GetMapping("/single_user")
    public User getUser() {
        System.out.println("get user");
        return new User("sigma", "boy");
    }
}
