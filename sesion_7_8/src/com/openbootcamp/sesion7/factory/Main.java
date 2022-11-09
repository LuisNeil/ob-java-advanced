package com.openbootcamp.sesion7.factory;

public class Main {
    public static void main(String[] args) {
        PriceFactory price = new PriceFactory("Spain");
        System.out.println(price.getPrice());
        PriceFactory price2 = new PriceFactory("USA");
        System.out.println(price2.getPrice());
    }
}
