package com.stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Stack<Carro> carros = new Stack<>();

        carros.add(new Carro("Ford"));
        carros.add(new Carro("Chevrolet"));
        carros.add(new Carro("Volkswagen"));
        carros.add(new Carro("Fiat"));


        System.out.println(carros);
        System.out.println(carros.pop());//Mostra e retira o ultimo
        System.out.println(carros);

        System.out.println(carros.peek());//Mostra o ultimo
        System.out.println(carros);

        System.out.println(carros.empty());//Verifica se a pilha está vazia
    }
}
