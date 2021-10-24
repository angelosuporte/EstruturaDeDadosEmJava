package com.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args){
        Queue<Carro> carros = new LinkedList<>();

        carros.add(new Carro("Ford"));
        carros.add(new Carro("Chevrolet"));
        carros.add(new Carro("Volkswagen"));
        carros.add(new Carro("Fiat"));


        System.out.println(carros);
        System.out.println(carros.add(new Carro("Peugeot")));
        System.out.println(carros);

        System.out.println(carros.offer(new Carro("Renault"))); //Mesma ação do add, mas não retorna erro
        System.out.println(carros);

        System.out.println(carros.peek());//Mostra o primeiro
        System.out.println(carros);

        System.out.println(carros.poll());//Mostra e remove o primeiro
        System.out.println(carros);
        System.out.println(carros.isEmpty());
        System.out.println(carros.size());
    }
}
