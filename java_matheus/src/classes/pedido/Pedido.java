package classes.pedido;

import classes.lanches.*;

import java.util.ArrayList;

public class Pedido {

    private ArrayList<lanche> lanches = new ArrayList<>();

    public void imprimirComanda() {
        for (lanche l : this.getLanches()) {
            if (l != null) {
                if (l instanceof miniPizza) {
                    miniPizza mp = ((miniPizza) l);
                    System.out.println("=====" + l.getTipo() + " - " + mp.getSabor() + "=======");
                    if (mp.isBordaRecheada()) {
                        System.out.println(" -- COM BORDA RECHEADA de " + mp.getBordaRecheada().toUpperCase() + " -- ");
                    }
                    if (l instanceof Pizza) {
                        System.out.println("Tamanho: " + ((Pizza) l).getTamanho());
                    }
                } else {
                    System.out.println("=====" + l.getTipo() + "=====");
                }
                if(l instanceof Xburger) {
                    if (((Xburger) l).isAberto()) {
                        System.out.println(" -- LANCHE ABERTO -- ");
                    }
                }
                System.out.printf("Valor: R$%.2f\n", l.getValor());
                System.out.println("-INGREDIENTES-");
                for (String ingrediente : l.getIngredientes()) {
                    if (ingrediente != null) {
                        System.out.println(ingrediente);
                    }
                }
                if (l instanceof Sanduiche) {
                    Sanduiche s = (Sanduiche) l;
                    if (s.getAdicional()[0] != null) {
                        System.out.println("--ADICIONAIS--");
                        for (String adicionar : s.getAdicional()) {
                            if (adicionar != null) {
                                System.out.println(adicionar);
                            }

                        }
                    }
                }


            }
        }
        System.out.printf("O preço do seu lanche é: R$ %.2f",calcularvalorTotal());
    }

    public double calcularvalorTotal() {
        double vlrTotal = 0;
        for (lanche l : this.getLanches()) {
            vlrTotal += l.getValor();
        }


        return vlrTotal;

    }

    public void adicionarLanche(lanche lanche) {
        this.lanches.add(lanche);
    }

    public ArrayList<lanche> getLanches() {
        return this.lanches;


    }
}