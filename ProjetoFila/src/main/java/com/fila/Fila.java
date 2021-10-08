package com.fila;

public class Fila {
    private No referenciaNoEntradaFila;

    public Fila(){
        this.referenciaNoEntradaFila = null;
    }

    public void enqueue(No novoNo){
        novoNo.setReferenciaNo(referenciaNoEntradaFila);
        referenciaNoEntradaFila = novoNo;
    }

    public No first(){
        if(!this.isEmpty()){
            No primeiroNo = referenciaNoEntradaFila;
            while (true){
                if(primeiroNo.getReferenciaNo() != null){
                    primeiroNo = primeiroNo.getReferenciaNo();
                }else{
                    break;
                }
            }

        }
        return null;
    }

    public No dequeue(){
        if(!this.isEmpty()){
            No primeiroNo = referenciaNoEntradaFila;
            No noAuxiliar = referenciaNoEntradaFila;
            while (true){
                if(primeiroNo.getReferenciaNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getReferenciaNo();
                }else{
                    noAuxiliar.setReferenciaNo(null);
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    public  boolean isEmpty(){
        return referenciaNoEntradaFila == null? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = referenciaNoEntradaFila;

        if(referenciaNoEntradaFila != null){
            while (true){
                stringRetorno += "[No{object=" + noAuxiliar.getObject() + "}]--->";
                if(noAuxiliar.getReferenciaNo() != null){
                    noAuxiliar = noAuxiliar.getReferenciaNo();
                }else{
                    stringRetorno += "null";
                    break;
                }
            }

        }else{
            stringRetorno = "null";
        }
        return stringRetorno;
    }
}
