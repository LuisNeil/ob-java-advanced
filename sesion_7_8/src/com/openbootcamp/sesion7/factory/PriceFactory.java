package com.openbootcamp.sesion7.factory;

public class PriceFactory {

    private Price price;

    public double getPrice(){
        return price.getPrice();
    }

    private PriceFactory(){

    }

    public PriceFactory(String country){
        if(country.equalsIgnoreCase("Spain")){
            System.out.println("Spain, price in EUR");
            this.price = new PriceEUR();
        }else {
            System.out.println("Another country, price in USD");
            this.price = new PriceUSD();
        }
    }
}
