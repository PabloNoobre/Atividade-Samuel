package br.com.caelum.ed.Testes;
import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class TesteLinearVSConstante {
    public static void main(String[] args) {

        Vetor vetor = new Vetor();

        long inicio = System.currentTimeMillis();

        for (int i =1; i<100; i++) {
            Aluno aluno = new Aluno();
            vetor.adiciona(aluno);
        }
        long fim = System.currentTimeMillis();
        double tempo = (fim - inicio)/ 1000.0;
        System.out.println("Tempo em segundos = "+ tempo);
    }

}
