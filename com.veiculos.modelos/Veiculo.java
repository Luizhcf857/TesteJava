package com.veiculos.modelos;

//Construtor da classe Veiculo
public class Veiculo{
    //Atributos da classe
    private String marca;
    private int ano;

    //COnstrutor da classe
    public Veiculo(String marca, int ano){
        this.marca = marca;
        this.ano = ano;
    }

    //metodo get para pegar a marca, porque ela está privada
    public String getMarca(){
        return marca;

    }

    /*metodo get para pegar ano, porque ele esta privado*/
    public int getAno(){
        return ano;

    }

    //Metodo para exibir as informações padrões
    public void exibirInformacoes(){
        System.out.printl("Marca: "+ this.marca);
        System.out.println("Ano: "+ this.ano);

    }


}