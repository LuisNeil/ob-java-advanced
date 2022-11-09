package com.openbootcamp.funcional;

import java.util.function.Function;

public class Funcionales {

    private final Function<String, String> toMayus = String::toUpperCase;

    public void tests(){
        String nombreMayus = toMayus.apply("luis neil tejeda");
        System.out.println(nombreMayus);
    }


}
