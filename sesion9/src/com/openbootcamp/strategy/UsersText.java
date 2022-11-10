package com.openbootcamp.strategy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsersText implements Users{

    private String textUsers = "users.txt";
    private PrintStream file;

    public UsersText(){
        try{
            file = new PrintStream(textUsers);
        } catch (Exception e){
            System.out.println("Cannot be opened: " + e.getMessage());
        }
    }

    public void create(String name){
        file.println(name);
    }

    public List<String> list(){
        List<String> users = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new File(textUsers));
            while (scanner.hasNext()){
                users.add(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return users;
    }
}
