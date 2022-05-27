package classes;

public class Xburger extends sanduiche {

    public boolean aberto;

    public Xburger(){

        this.adicionarIngrediente("Alface");
        this.adicionarIngrediente("Queijunto");
        this.adicionarIngrediente("Preijo");
        this.adicionarIngrediente("Pão");
        this.tipo = "Xburger";
    }

    @Override
    public void montarComanda(){
        super.montarComanda();
        if (this.aberto){
            System.out.println(" -- LANCHE ABERTO -- ");
        }

    }

}

