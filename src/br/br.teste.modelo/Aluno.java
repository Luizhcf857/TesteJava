package br.teste.modelo;

public class Aluno{
    private String nome;
    private int idade;

    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;

    }
    
    public getNome(){
        return this.nome;

    }
    
    public String setNome(String n){
        this.nome = n;

    }

    public getIdade(){
        return this.idade;

    }

    public int setIdade(int i){
        this.idade = i;

    }

    public void exibirInformacoes(){

        
    }

}
