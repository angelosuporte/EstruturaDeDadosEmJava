package com.fila;

public class Main {
    public static void main(String[] args){

        Fila fila = new Fila();

        fila.enqueue("primeiro");
        fila.enqueue("segundo");
        fila.enqueue("terceiro");
        fila.enqueue("Fui");
        fila.enqueue("quinto");
        fila.enqueue("1");
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
