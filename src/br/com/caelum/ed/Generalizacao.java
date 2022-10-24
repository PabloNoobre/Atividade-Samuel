package br.com.caelum.ed;

import br.com.caelum.ed.Aluno;

public class Generalizacao {public class Vetor {


    private Object[] objetos = new Object[100];

    private int totalDeObjetos = 0;                                   //totalDeAluno é o índice


    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao <= this.totalDeObjetos;
    }

    private void garanteEspaco(){
        if (this.totalDeObjetos == this.objetos.length) {                 //se o total de alunos passar o tamanho da array
            Aluno[] novaArray = new Aluno[this.objetos.length*2];
            for (int i = 0; i < this.objetos.length; i++) {
                novaArray[i] = (Aluno) this.objetos[i];
            }
            this.objetos = novaArray;
        }
    }

    public void adiciona(Aluno aluno){

        this.garanteEspaco();
        this.objetos[this.totalDeObjetos] = objetos;
        this.totalDeObjetos++;

        this.objetos[this.totalDeObjetos] = aluno;
        this.totalDeObjetos++;

        for (int i=0; i < this.objetos.length; i++) {   //criação de uma variavel de indice e laço de repetição.
            if (this.objetos[i] == null) {              //se a posição tiver valor null,
                this.objetos[i] = aluno;                //a posição vai receber o valor alunos.
                break;                                  //forçar parada.

            }
        }
    }

    public void adiciona(int posicao, Aluno aluno) {
        this.garanteEspaco();
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posicao inválida");
        }
        for (int i = this.totalDeObjetos - 1; i >= posicao; i--) {
            this.objetos[i + 1] = this.objetos[i];
        }
        this.objetos[posicao] = aluno;
        this.totalDeObjetos++;
    }

    public Object pega(int posicao) {
        if (!this.posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.objetos[posicao];
    }

    public void remove(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i <this.totalDeObjetos - 1; i++){
            this.objetos[i] = this.objetos[i+1];
        }
        this.totalDeObjetos--;
    }

    public boolean contem(Aluno aluno) {            //método pra saber se contem algum aluno no vetor

        for (int i = 0; i<this.objetos.length; i++){
            if (aluno == this.objetos[i]){
                return true;
            }
        }
        return false;
    }

    public int tamanho() {
        return this.totalDeObjetos;
    }

    public String toString(){
        if(this.totalDeObjetos==0) {                      //caso a quantidade de espaços ocupados no vetor seja 0 retorna só []
            return "[]";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("[");

        for (int i =0; i<this.totalDeObjetos-1; i++){
            builder.append(this.objetos[i]);
            builder.append(", ");
        }

        builder.append(this.objetos[this.totalDeObjetos-1]);
        builder.append("]");
        return builder.toString();

    }

}
}
