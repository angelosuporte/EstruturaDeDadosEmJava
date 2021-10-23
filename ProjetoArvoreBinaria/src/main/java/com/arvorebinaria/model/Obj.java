package com.arvorebinaria.model;

import java.util.Objects;

public class Obj extends ObjArvore<Obj>{
    Integer Valor;

    public Obj(Integer Valor){
        this.Valor = Valor;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obj obj = (Obj) o;
        return Objects.equals(Valor, obj.Valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Valor);
    }

    @Override
    public int compareTo(Obj outro) {
        int i = 0;

        if(this.Valor > outro.Valor){
            i = 1;
        }else if(this.Valor < outro.Valor){
            i = -1;
        }

        return i;
    }

    @Override
    public String toString() {
        return Valor.toString();
    }
}
