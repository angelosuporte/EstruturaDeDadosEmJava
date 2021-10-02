package com.projeto.estruturadedados;

public class Main {
    public static void main(String[] args){
        //atribuição
        int a = 1;
        int b = 2;
        int c =  a + b;

        System.out.println(c);

        //referência
        Objeto objA = new Objeto(1);
        Objeto objB = new Objeto(2);

        System.out.println("objA = " + objA +  " objB = " + objB);
    }
}
