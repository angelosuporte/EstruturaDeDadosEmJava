package com.fila;

//Usando T como Generics
public class No<T> {
    private T object;
    private No referenciaNo;

    public No(){
    }

    public No(T object) {
        this.referenciaNo = null;
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public No getReferenciaNo() {
        return referenciaNo;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public void setReferenciaNo(No referenciaNo) {
        this.referenciaNo = referenciaNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "object=" + object +
                '}';
    }
}
