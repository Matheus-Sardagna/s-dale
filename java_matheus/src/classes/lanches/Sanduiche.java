package classes.lanches;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Sanduiche extends lanche {

    private HashMap<String , ArrayList<Sanduiche>> sanduiche = new HashMap<>();


    public void adicionarAdicional(String adicionar) {
        this.adicional.add(adicionar);
    }

    public String[] getAdicional() {
        return adicional.toArray(new String[0]);
    }

    public void setAdicional(ArrayList<String> adicional) {
        this.adicional = adicional;
    }

    public double getValor(){
        double valorOriginalLanche super.getValor();
    }

}




