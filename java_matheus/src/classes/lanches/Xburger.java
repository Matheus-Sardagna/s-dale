package classes.lanches;

public class Xburger extends Sanduiche {

    private boolean aberto;

    public Xburger(){

        this.adicionarIngrediente("Alface");
        this.adicionarIngrediente("Queijunto");
        this.adicionarIngrediente("Preijo");
        this.adicionarIngrediente("Pão");
        this.tipo = "Xburger";
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
}

