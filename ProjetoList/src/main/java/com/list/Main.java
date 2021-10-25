package com.list;

import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args){
        List<Carro> carros = new LinkedList<>();

        carros.add(new Carro("Ford"));
        carros.add(new Carro("Chevrolet"));
        carros.add(new Carro("Volkswagen"));
        carros.add(new Carro("Fiat"));


        System.out.println(carros);
        System.out.println(carros.contains(new Carro("Peugeot")));
        System.out.println(carros.get(2)); //Mostra a marca do index 2

        System.out.println(carros.indexOf(new Carro("Fiat"))); //Mostra o index

        System.out.println(carros.remove(2));
        System.out.println(carros);

        System.out.println(carros.isEmpty());
        System.out.println(carros.size());
    }
}
