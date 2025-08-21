package com.veiculos.modelos;

public class Carro extends Veiculo{
    //Atributo da classe Carro
    private int numeroPortas;

    public Carro(String marca, int ano, int numeroPortas){
        super(marca, ano);

        this.numeroPortas = numeroPortas;

    }
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Numero de portas: "+ this.numeroPortas);

    }



}