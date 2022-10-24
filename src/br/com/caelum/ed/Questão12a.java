package br.com.caelum.ed;

import br.com.caelum.ed.vetores.Vetor;
import br.com.caelum.ed.Aluno;
import java.util.Scanner;

public class Questão12a {
    public static void main(String[] args) {
        Aluno[] aluno = new Aluno[1000];
        Scanner dado = new Scanner(System.in);
        Vetor vetor = new Vetor();
        String nome= dado.nextLine();

        for (int i = 0; i<100; i++){
            vetor.adiciona(i, aluno);
        }
        System.out.println(vetor.toString());

        

    }
}
