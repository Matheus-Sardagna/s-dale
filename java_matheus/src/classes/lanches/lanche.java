package classes.lanches;

import java.util.ArrayList;

public abstract class lanche {


    private ArrayList<String> ingredientes = new ArrayList<>();
    private double valor;

    String tipo;

    public void adicionarIngrediente(String ingrediente) {
       this.ingredientes.add(ingrediente);
    }

    public double getValor() {
        return this.valor;
    }


    public void setValor(double valor){
        this.valor = valor;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }


    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }
}





