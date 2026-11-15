package com.javaspring.trafic_light.model;

public class TraficLight {
    private String state;

    public TraficLight() {
        this.state = "btn-danger";
    }

    public TraficLight(String state) {
        this.state = state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }
}
