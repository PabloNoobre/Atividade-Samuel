package br.com.caelum.ed.Testes;

import br.com.caelum.ed.Aluno;
import br.com.caelum.ed.vetores.Vetor;

public class TesteTamanhoLista {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();                     //criação dos objetos
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();

        a1.setNome("Rafael");                       //atribuição de valores ao atributo pelo metodo setNome
        a2.setNome("Paulo");

        Vetor lista = new Vetor();

        lista.adiciona(a1);                         //adiciona os objetos à lista criada
        lista.adiciona(a2);

        System.out.println(lista.tamanho());        //imprime na tela o tamanho da lista com os valores inseridos, no caso só 2

        lista.adiciona(a3);

        System.out.println(lista.tamanho());        //imprime na tela o tamanho novo, agora com 3 valores

    }
}
