package com.pu.fmi.workshop.toys;

public abstract class Toy {
    private String name;

    public Toy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
