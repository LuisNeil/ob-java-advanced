package com.openbootcamp.sesion7.builder;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new VehicleBuilder("Mazda")
                .setDoors(5)
                .setMotor("Gasoline")
                .setType("Combustion")
                .build();
        System.out.println(vehicle.getBrand());
        System.out.println(vehicle.getDoors());
        System.out.println(vehicle.getType());
        System.out.println(vehicle.getMotor());
    }
}
