package com.openbootcamp.funcional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
//        Funcionales f = new Funcionales();
//        f.tests();

        List<String> names = new ArrayList<>();
        names.add("luis ");
        names.add("maria");
        names.add("juan");

        names.stream().map(String::toUpperCase).filter(x->x.startsWith("l")).forEach(System.out::println);
    }

}
