package com.pu.fmi.workshop.toys;

public enum ToyType {
    Bicycle("Колело"),
    Doll("Кукла");

    String type;

    ToyType(String type) {
        this.type = type;
    }

    public String type() {
        return this.type;
    }
}
