package com.openbootcamp.strategy;

import java.util.ArrayList;
import java.util.List;

public class UsersMemory implements Users{

    private List<String> users = new ArrayList<>();

    public void create(String name){
        users.add(name);
    }

    public List<String> list(){
        return users;
    }
}
