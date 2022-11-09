package com.openbootcamp.sesion7.prototypecloneable;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();

        vehicle.brand = "Mazda";
        vehicle.model = "CX5";

        try {
            Vehicle vehicle2 = vehicle.clones();
            System.out.println(vehicle2.brand);
            vehicle2.brand = "Nissan";
            System.out.println(vehicle2.brand);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
