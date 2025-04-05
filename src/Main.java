import models.Carro;
import models.ContaBancaria;
import models.Fabricante;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.Modelo = "Hilux";
        carro.Ano= 2024;
        carro.Cor= "Cinza";
        carro.id= 25635835L;



        carro.ExibirInformacao();
        System.out.println( "conceito de abstração!!");
        carro.MoverVeiculo();


        System.out.println("Conceito Polimorfismo");
        Fabricante fab = new Fabricante();
        fab.VeiculoDoAno();

        System.out.println("Conceito de encapsulamento");
        ContaBancaria saldo =  new ContaBancaria ();

        // saldo inicial
        saldo.Depositar(450.32);
        System.out.println(saldo.getSaldo());









    }
}