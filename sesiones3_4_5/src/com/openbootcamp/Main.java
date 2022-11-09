package com.openbootcamp;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println(suma(6));
        System.out.println(sumaRecursiva(6));
        System.out.println(sumaFuncional(6));

        System.out.println(factorial(5));
        System.out.println(factorialRecursivo(5));
        System.out.println(factorialFuncional(5));
//        tailRecursion(5);
//        System.out.println("==========");
//        headRecursion(5);
//        System.out.println("==========");

    }

    public static int factorial(int numero){
        int resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static int factorialRecursivo(int numero){
        if(numero == 0){
            return 1;
        }

        return numero * factorialRecursivo(numero - 1);
    }

    public static int factorialFuncional(int numero){
        return IntStream.rangeClosed(1, numero).reduce(1, (a, b) -> a * b);
    }

    public static int sumaRecursiva(int num) {
        if (num == 1) {
            return 1;
        }
        return num + sumaRecursiva(num - 1);

    }

    public static void headRecursion(int valor){
        if (valor == 0){
            return;
        }

        headRecursion(valor-1);
        System.out.println(valor);
    }

    public static void tailRecursion(int valor) {
        if (valor == 0) {
            return;
        }
        System.out.println(valor);
        tailRecursion(valor - 1);
    }

    public static int sumaFuncional(int num){
        return IntStream.rangeClosed(1,num).reduce(0, Integer::sum);
    }

    public static int suma(int max) {
        int resultado = 0;

        for (int i = 0; i <= max; i++) {
            resultado += i;
        }
        return resultado;
    }

}
