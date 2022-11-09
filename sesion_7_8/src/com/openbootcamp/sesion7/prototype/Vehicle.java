package com.openbootcamp.sesion7.prototype;

public class Vehicle {
    public String brand;
    public String model;
    public int year;

    public Vehicle(){

    }

    public Vehicle clones(){
        Vehicle clone = new Vehicle();
        clone.brand = this.brand;
        clone.model = this.model;
        clone.year = this.year;
        return clone;
    }
}
