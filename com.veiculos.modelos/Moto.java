package com.veiculos.modelos;

//Classe da Moto
public class Moto extends Veiculo{
    //Atributo da Moto
    private boolean temPartidaEletrica;
    private partida;

    //Construtor da classe Moto
    public Moto(String marca, int ano, boolean temPartidaEletrica){
        super(marca, ano);

        this.temPartidaEletrica = temPartidaEletrica;
        this.partida = partida;

    }

    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Partida eltrica[sim/nao]: ");
        partida = entrada.nextLine();
        
    }

    public boolean getTemPartidaEletrica(){
        if(partida = "sim"){
            return temPartidaEletrica = true;

        }else{
            return temPartidaEletrica = false;

        }


    }


}