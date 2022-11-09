package com.openbootcamp.sesion7.singleton;

public class Main {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        singleton.setCount(15);
        System.out.println(singleton.getCount());
        System.out.println(singleton);

        Singleton singleton2 = Singleton.getInstance();
        singleton2.setCount(10);
        System.out.println(singleton.getCount());
        System.out.println(singleton2);
    }
}
