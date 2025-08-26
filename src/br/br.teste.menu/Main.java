package br.teste.menu;

import br.teste.modelo.Aluno;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Aluno aluno = new Aluno();
        
        System.out.println("Digite o nome do aluno: ");
        aluno.setNome = entrada.nextLine();

        System.out.println("O nome que voce digitou eh: "+ aluno.getNome());

        entrada.close();
    }

}