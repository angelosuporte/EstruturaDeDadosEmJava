package com.fila;

public class Main {
    public static void main(String[] args){

        Fila fila = new Fila();

        fila.enqueue(new No("primeiro"));
        fila.enqueue(new No("segundo"));
        fila.enqueue(new No("terceiro"));
        fila.enqueue(new No("Fui"));
        fila.enqueue(new No("quinto"));
        System.out.println(fila);

        System.out.println(fila.first());


        fila.dequeue();

        System.out.println(fila);
        fila.dequeue();
        fila.dequeue();
        fila.enqueue(new No("voltei"));
        System.out.println(fila);


    }
}
