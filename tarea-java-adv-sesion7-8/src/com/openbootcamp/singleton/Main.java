package com.openbootcamp.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();

        System.out.println("Hascode of x is: " + x.hashCode());
        System.out.println("Hascode of y is: " + y.hashCode());
        System.out.println("Hascode of z is: " + z.hashCode());

        if(x == y && y == z){
            System.out.println("Three objects point to the same memory loctaion on the heap");
        } else {
            System.out.println("Three objects DO NOT point to the same memory location on the heap");
        }
    }
}
