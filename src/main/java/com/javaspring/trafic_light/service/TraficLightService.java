package com.javaspring.trafic_light.service;

import com.javaspring.trafic_light.model.TraficLight;
import org.springframework.stereotype.Service;

@Service
public class TraficLightService {
    private TraficLight traficLight = new TraficLight();

    public String getState() {
        return traficLight.getState();
    }

    public void setState(String state) {
        traficLight.setState(state);
    }

    public String changeState() {
        switch (traficLight.getState()) {
            case "btn-danger":
                traficLight.setState("btn-warning");
                break;
            case "btn-warning":
                traficLight.setState("btn-success");
                break;
            case "btn-success":
                traficLight.setState("btn-danger");
                break;
        }
        return traficLight.getState();
    }
}
