package com.pilha;

public class No {
    private int dado;
    private No referenciaNo = null;

    public No(){
    }

    public No(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public No getReferenciaNo() {
        return referenciaNo;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public void setReferenciaNo(No referenciaNo) {
        this.referenciaNo = referenciaNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }
}
