package com.javaspring.trafic_light.controller;

import com.javaspring.trafic_light.service.TraficLightService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private TraficLightService traficLightService;

    public Controller(TraficLightService traficLightService) {
        this.traficLightService =  traficLightService;
    }

    @GetMapping("/reset")
    public String reset() {
        traficLightService.setState("btn-danger");
        return traficLightService.getState();
    }

    @GetMapping("/change-color")
    public String changeColor() {
        traficLightService.changeState();
        return traficLightService.getState();
    }
}
