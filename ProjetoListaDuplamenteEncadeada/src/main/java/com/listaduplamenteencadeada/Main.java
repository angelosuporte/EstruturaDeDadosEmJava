package com.listaduplamenteencadeada;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> duplamenteEncadeada = new ListaDuplamenteEncadeada();

        duplamenteEncadeada.add("c1");
        duplamenteEncadeada.add("c2");
        duplamenteEncadeada.add("c3");
        duplamenteEncadeada.add("c4");
        duplamenteEncadeada.add("c5");
        duplamenteEncadeada.add("c6");
        duplamenteEncadeada.add("c7");

        System.out.println(duplamenteEncadeada);
        duplamenteEncadeada.remove(2);
        duplamenteEncadeada.add("c10");
        System.out.println(duplamenteEncadeada);
    }
}
