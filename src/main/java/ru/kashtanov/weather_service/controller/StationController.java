package ru.kashtanov.weather_service.controller;

import org.springframework.web.bind.annotation.*;
import ru.kashtanov.weather_service.models.ChargingStation;
import ru.kashtanov.weather_service.models.User;

@RestController
@RequestMapping("/api")
//@CrossOrigin(origins = "*")
public class StationController {

    @GetMapping("/single_user")
    public User getUser() {
        System.out.println("get user");
        return new User("sigma", "boy");
    }

    @GetMapping("/get_command")
    public User getCommand() {
        System.out.println("get user");
        return new User("sigma", "boy");
    }

    @PostMapping("/send_info")
    public void sendStationInfo(@RequestBody ChargingStation chargingStation) {
        System.out.println("POST station info: " + chargingStation);
    }
}
