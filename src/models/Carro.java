package models;

public class Carro extends veiculo {
    public Long id;
    public String Modelo;
    public String Cor;

    public int Ano;


    public void ExibirInformacao() {
        System.out.println("o número do chassi é: "+ id + " Modelo: " + Modelo + " Ano: " + Ano + " A cor é: " + Cor);

        }


    @Override

    public void MoverVeiculo() {

        System.out.println(" O Carro está  em movimento");
        System.out.println("O Carro está em alta velocidade");

    }
}


