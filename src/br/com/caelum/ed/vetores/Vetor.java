package br.com.caelum.ed.vetores;

import br.com.caelum.ed.Aluno;

public class Vetor {


    private Aluno[] alunos = new Aluno[100];

    private int totalDeAlunos = 0;                                   //totalDeAluno é o índice


    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao <= this.totalDeAlunos;
    }

    private void garanteEspaco(){
        if (this.totalDeAlunos == this.alunos.length) {                 //se o total de alunos passar o tamanho da array
            Aluno[] novaArray = new Aluno[this.alunos.length*2];
            for (int i = 0; i < this.alunos.length; i++) {
                novaArray[i] = (Aluno) this.alunos[i];
            }
            this.alunos = novaArray;
        }
    }

    public void adiciona(Aluno aluno){

        this.garanteEspaco();
        this.alunos[this.totalDeAlunos] = aluno;
        this.totalDeAlunos++;

        this.alunos[this.totalDeAlunos] = aluno;
        this.totalDeAlunos++;

        for (int i = 0; i < this.alunos.length; i++) {   //criação de uma variavel de indice e laço de repetição.
            if (this.alunos[i] == null) {              //se a posição tiver valor null,
                this.alunos[i] = aluno;                //a posição vai receber o valor alunos.
                break;                                  //forçar parada.

            }
        }
    }

    public void adiciona(int posicao, Aluno aluno) {
        this.garanteEspaco();
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posicao inválida");
        }
        for (int i = this.totalDeAlunos - 1; i >= posicao; i--) {
            this.alunos[i + 1] = this.alunos[i];
        }
        this.alunos[posicao] = aluno;
        this.totalDeAlunos++;
    }

    public Object pega(int posicao) {
        if (!this.posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.alunos[posicao];
    }

    public void remove(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i <this.totalDeAlunos - 1; i++){
            this.alunos[i] = this.alunos[i+1];
        }
        this.totalDeAlunos--;
    }

    public boolean contem(Aluno aluno) {            //método pra saber se contem algum aluno no vetor

        for (int i = 0; i<this.alunos.length; i++){
            if (aluno == this.alunos[i]){
                return true;
            }
        }
        return false;
    }

    public int tamanho() {
        return this.totalDeAlunos;
    }

    public String toString(){
        if(this.totalDeAlunos ==0) {                      //caso a quantidade de espaços ocupados no vetor seja 0 retorna só []
            return "[]";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("[");

        for (int i = 0; i<this.totalDeAlunos -1; i++){
            builder.append(this.alunos[i]);
            builder.append(", ");
        }

        builder.append(this.alunos[this.totalDeAlunos -1]);
        builder.append("]");
        return builder.toString();

    }

}
