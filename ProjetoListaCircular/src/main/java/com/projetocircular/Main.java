package com.projetocircular;

public class Main {
    public static void main(String[] args) {
        ListaCircular<String> circular = new ListaCircular<>();

        circular.add("c0");
        System.out.println(circular);

        circular.remove(0);
        System.out.println(circular);

        circular.add("c1");
        System.out.println(circular);
        circular.add("c2");
        circular.add("c3");

        System.out.println(circular);

        System.out.println("Verificando loop por indice usando método get");

     //   System.out.println(circular.get(0));
     //   System.out.println(circular.get(1));
     //   System.out.println(circular.get(2));
     //   System.out.println(circular.get(3));

        for (int i = 0; i < 20; i++) {
            System.out.println(circular.get(i));
        }
    }
}