package classes;

import java.util.Scanner;

public class miniPizza extends lanche{

    public boolean bordaRecheada;

    public String sabordeborda;
    public miniPizza(){
        this.adicionarIngrediente("Massa caseira");
        this.adicionarIngrediente("Calabresa");
        this.adicionarIngrediente("Queijo");
        this.adicionarIngrediente("Cebola");
        this.tipo = "Mini pizza";

    }
    @Override
    public void montarComanda(){
        super.montarComanda();
        if (this.bordaRecheada){
            System.out.println(" -- COM BORDA RECHEADA de "+this.sabordeborda.toUpperCase()+" -- ");
        }



    }
}
