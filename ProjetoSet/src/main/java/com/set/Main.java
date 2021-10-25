package com.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args){
        Set<Carro> carros = new HashSet<>();

        carros.add(new Carro("Ford"));
        carros.add(new Carro("Chevrolet"));
        carros.add(new Carro("Volkswagen"));
        carros.add(new Carro("Fiat"));
        carros.add(new Carro("Peugeot"));
        carros.add(new Carro("Alfa Romeo"));

        System.out.println(carros);


        Set<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Chevrolet"));
        treeSetCarros.add(new Carro("Volkswagen"));
        treeSetCarros.add(new Carro("Zip"));
        treeSetCarros.add(new Carro("Peugeot"));
        treeSetCarros.add(new Carro("Alfa Romeo->"));//Inserido -> porque estava omitindo por ser de mesmo tamanho de outra marca


        System.out.println(treeSetCarros);
    }
}
