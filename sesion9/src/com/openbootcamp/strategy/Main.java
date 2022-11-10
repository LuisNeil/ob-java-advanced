package com.openbootcamp.strategy;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UsersMemory users = new UsersMemory();

        create(users,"Luis");
        create(users,"Maria");
        create(users,"Rafael");

        for(String user: users.list()){
            System.out.println(user);
        }

    }

    public static void create(Users users, String name){
        users.create(name);
    }

    public static List<String> list(Users users){
        return users.list();
    }
}
