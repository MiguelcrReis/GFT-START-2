package Ex03;
import java.util.*;
import java.text.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Jogador {
    private String nome;
    private String posicao;
    //private String dataNasc;
    private int diaNasc;
    private int mesNasc;
    private int anoNasc;

    public Jogador(String nome, String posicao, int diaNasc, int mesNasc, int anoNasc) {
        this.nome = nome;
        this.posicao = posicao;
        this.diaNasc = diaNasc;
        this.mesNasc = mesNasc;
        this.anoNasc = anoNasc;
    }

    public int getDiaNasc() {
        return diaNasc;
    }

    public void setDiaNasc(int diaNasc) {
        this.diaNasc = diaNasc;
    }

    public int getMesNasc() {
        return mesNasc;
    }

    public void setMesNasc(int mesNasc) {
        this.mesNasc = mesNasc;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void calcularIdade(int anoNascimento){
        int atual = 2021;
        System.out.println((atual - anoNascimento)+" anos de idade");
    }


    public void calcularAposentadoria(String posicao, int anoNascimento){
        if (posicao.equals("Atacante")) {
            int aposentar = 35;
            int idade = 2021 - anoNascimento;
            System.out.println("Faltam " + (aposentar - idade) + " ano(os) para se aposentar");

        } else if (posicao.equals("Defesa")) {
            int aposentar = 40;
            int idade = 2021 - anoNascimento;
            System.out.println("Faltam " + (aposentar - idade) + " ano(os) para se aposentar");

        } else if (posicao.equals("Meio-Campo")) {
            int aposentar = 38;
            int idade = 2021 - anoNascimento;
            System.out.println("Faltam " + (aposentar - idade) + "ano(os) para se aposentar");

        }
    }


    public String toString() {
        return "Jogador{" +
                "Nome: '" + nome + '\'' +
                ", Posição: '" + posicao + '\'' +
                ", Data de Nascimento:'" +  (diaNasc+"/"+mesNasc+"/"+anoNasc) + '\'' +
                '}';
    }
}
