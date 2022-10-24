package br.com.caelum.ed;

public class Aluno {
    private String nome;                                //cria o atributo nome do tipo string

    public String getNome(){                            //criação de um método pra retornar o valor atribuido a variavel nome
        return nome;
    }

    public void setNome(String nome){                   //método para inserir valor ao atributo nome
        this.nome=nome;                                 //referencia ao atributo privado nome
    }

    public String toString(){
        return this.nome;
    }

    public boolean equals(Object o){
        Aluno outro = (Aluno)o;
        return this.nome.equals(outro.nome);
    }

}
