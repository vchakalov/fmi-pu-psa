package com.pu.fmi.workshop.toys;


public class ToyFactory {
    public static Toy createToy(ToyType type) {
        System.out.println("създаване на играчка от тип " + type.type());
        if (type == ToyType.Bicycle) {
            return new Bicycle();
        }
        return new Doll();
    }
}
