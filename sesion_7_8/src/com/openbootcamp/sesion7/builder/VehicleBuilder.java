package com.openbootcamp.sesion7.builder;

public class VehicleBuilder {

    Vehicle vehicle;

    public VehicleBuilder(String brand){
        vehicle = new Vehicle();
        vehicle.brand = brand;
    }

    public VehicleBuilder setDoors(int doors){
        vehicle.doors = doors;
        return this;
    }

    public VehicleBuilder setMotor(String motor){
        vehicle.motor = motor;
        return this;
    }

    public VehicleBuilder setType(String type){
        vehicle.type = type;
        return this;
    }

    public Vehicle build(){
        return this.vehicle;
    }
}
