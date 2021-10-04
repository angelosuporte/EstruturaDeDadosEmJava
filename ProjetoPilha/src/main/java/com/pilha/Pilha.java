package com.pilha;

public class Pilha {
    private No refNoEntradaPilha;

    public Pilha(){
        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo){
        No refAnterior = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setReferenciaNo(refAnterior);
    }

    public No pop() {
        if (!this.isEmpty()) {
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getReferenciaNo();
            return noPoped;
        }
        return null;
    }
    public No top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty() {

 //       if (refNoEntradaPilha == null) {
 //           return true;
 //       }
 //       return false;
        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "------------\n";
        stringRetorno += "    Pilha\n";
        stringRetorno += "------------\n";

        No noQuePercorrepilha = refNoEntradaPilha;

        while (true) {
            if (noQuePercorrepilha != null) {
                stringRetorno += "[No{dado=" + noQuePercorrepilha.getDado() + "}]\n";
                noQuePercorrepilha = noQuePercorrepilha.getReferenciaNo();
            } else {
                break;
            }
        }
        stringRetorno += "=============\n";
        return stringRetorno;
    }
}
