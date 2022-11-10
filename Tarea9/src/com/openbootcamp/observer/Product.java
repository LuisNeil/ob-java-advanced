package com.openbootcamp.observer;

import java.util.LinkedHashSet;
import java.util.Set;

public class Product implements IObservable{

    private Set<IObserver> observers;

    private int stock;

    public Product(int stock) {
        this.stock = stock;
        this.observers = new LinkedHashSet<>();
    }

    public void sell(){
        this.setStock(this.stock - 1);
        System.out.println("Product sold");
        this.notifyObservers();
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public void addObserver(IObserver o) {
        this.observers.add(o);
    }

    @Override
    public void notifyObservers() {
        for(IObserver observer: this.observers){
            observer.notification("The product was sold");
        }
    }

    @Override
    public void removeObserver() {

    }
}
