package Classes;

import Classes.Item.Item;

public class Estante {
    private int capMaxima;
    private Item[] itens;

    public Estante(int capacidadeMaxima) {
        setCapMaxima(capacidadeMaxima);
        setItens(new Item[capacidadeMaxima]);

    }

    public boolean estanteCheia() {
        return false;
    }

    public int quantidadeItens() {
        return 0;
    }

    public Item buscarItem(String titulo) {
        return null;
    }

    public boolean adicionarItem(Item item) {
        return false;
    }
    public Item removerItem(int posicao){
        return null;
    }


    //GETTERS & SETTERS


    public int getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }





    public Item[] getItens() {
        return itens;
    }

    public void setItens(Item[] itens) {
        this.itens = itens;
    }
}

