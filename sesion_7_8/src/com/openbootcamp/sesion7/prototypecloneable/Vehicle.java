package com.openbootcamp.sesion7.prototypecloneable;

public class Vehicle  implements Cloneable{

    public String brand;
    public String model;

    public Vehicle(){

    }

    public Vehicle clones() throws CloneNotSupportedException{
        return (Vehicle) this.clone();
    }
}
