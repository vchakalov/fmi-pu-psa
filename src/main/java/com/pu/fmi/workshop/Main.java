package com.pu.fmi.workshop;

public class Main {
    public static void main(String[] args) {
        Workshop workshop = new Workshop();
        SantaClaus santa = workshop.getSanta();
        Toy doll = santa.orderToy("Трябват ми кукли");
        System.out.println("Поръчката е готова " + doll.getName());
        System.out.println("----");
        Toy bicycle = santa.orderToy("Трябват ми колелата");
        System.out.println("Поръчката е готова " + bicycle.getName());
    }
}
