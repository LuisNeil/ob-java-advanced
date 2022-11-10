package com.openbootcamp.iterator;

public class Main {

    public static void main(String[] args) {
        Users users = new Users();
        users.create(new User("one", 20));
        users.create(new User("two", 30));
        users.create(new User("three", 35));
        users.create(new User("four", 25));

        while (users.hasMore()){
            User user = users.next();
            System.out.println("User is: " + user.getName() + ". Has age: " + user.getAge());
        }

        users.create(new User("five", 28));
        User user = users.next();
        System.out.println("User is: " + user.getName() + ". Has age: " + user.getAge());

        users.reset();
        while (users.hasMore()){
            user = users.next();
            System.out.println("User is: " + user.getName() + ". Has age: " + user.getAge());
        }
    }
}