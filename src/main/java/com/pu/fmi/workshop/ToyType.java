package com.pu.fmi.workshop;

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
