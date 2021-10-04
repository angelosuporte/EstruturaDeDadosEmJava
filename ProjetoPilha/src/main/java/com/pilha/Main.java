package com.pilha;

public class Main {
    public static void main(String[] args){

        Pilha pilha = new Pilha();
        pilha.push(new No(1));
        pilha.push(new No(2));
        pilha.push(new No(3));
        pilha.push(new No(4));
        pilha.push(new No(5));
        pilha.push(new No(6));
        pilha.push(new No(7));

        System.out.println(pilha);
        //removendo
        System.out.println(pilha.pop());
        //mostra topo
        System.out.println(pilha.top());
        System.out.println(pilha);
    }
}
