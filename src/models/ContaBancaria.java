package models;
// conceito de encapsulamento
public class ContaBancaria {
    private double saldo = 1588.35;

    public void Depositar (double valor) {
        if (valor>0) saldo += valor;

    }
    public double getSaldo (){

        return saldo;
    }
    public void setSaldo (double saldo){
        saldo =saldo;


    }
}
