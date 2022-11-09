package com.openbootcamp.sesion7.singleton;

public class Singleton {

    private static Singleton instance;
    public int count;

    private Singleton(){

    }
    
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


}
