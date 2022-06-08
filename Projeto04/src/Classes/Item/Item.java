package Classes.Item;


import Classes.avaliacao.Avaliação;

import java.util.Scanner;

public class Item {
    private String titulo;
    private String genero;
    private double valor;
    private Avaliação[] avaliacoes = new Avaliação[30];

    public void avaliar() {
        Scanner in = new Scanner(System.in);
        Avaliação a = new Avaliação();
        System.out.println("Informe o nome do Avaliador: ");
        a.setNome(in.nextLine());
        System.out.println("Informe uma nota de 0 a 10: ");
        a.setRating(in.nextDouble());
        in.nextLine();
        System.out.println("Informe algum feedback (opcional): ");
        a.setFeedback(in.nextLine());
        for(int i = 0; i < getAvaliacoes().length; i++){
            if(getAvaliacoes()[i] == null){
                getAvaliacoes()[i] = a;
                break;
            }
        }
    }

    public double getTotalRating() {
        double soma = 0;
        int contador = 0;
        for (Avaliação a : getAvaliacoes()){
            if (a != null){
                soma += a.getRating();
                contador++;
            }
        }
        return soma/contador;
    }

    //GETTERS & SETTERS


    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }


    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    public Avaliação[] getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(Avaliação[] avaliacoes) {
        this.avaliacoes = avaliacoes;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


}
