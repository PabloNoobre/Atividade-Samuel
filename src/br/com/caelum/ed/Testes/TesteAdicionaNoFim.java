package br.com.caelum.ed.Testes;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class TesteAdicionaNoFim {
    public static void main(String[] args) {

        Aluno a1 = new Aluno();         //criação do objeto usando o contrutor da classe Aluno
        Aluno a2 = new Aluno();

        a1.setNome("Rafael");           //usando o método setNome pra atribuir um valor ao atributo nome
        a2.setNome("Paulo");

        Vetor lista = new Vetor();      //criação do objeto usando o contrutor da classe Vetor

        lista.adiciona(a1);
        lista.adiciona(a2);

        System.out.println(lista);

    }
}
