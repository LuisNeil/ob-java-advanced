package com.openbootcamp.sesion7.prototype;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.year = 2022;
        vehicle.brand = "Toyota";
        vehicle.model = "Corolla";

        Vehicle vehicle1 = vehicle.clones();
        System.out.println(vehicle1.brand);
        vehicle1.brand = "Mazda";
        System.out.println(vehicle1.brand);
    }
}
