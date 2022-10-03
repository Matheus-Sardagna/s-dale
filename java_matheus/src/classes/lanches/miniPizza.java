package classes.lanches;

public class miniPizza extends lanche{

    private boolean bordaRecheada;

    private String sabordeborda;

    private String sabor;

    public miniPizza(){
        this.adicionarIngrediente("Massa caseira");
        this.adicionarIngrediente("Queijo");
        this.adicionarIngrediente("Massa de tomate");
        this.setTipo("Mini pizza");

    }

    public void adicionarSaborEIngredientes(String sabor){
        this.setSabor(sabor);
        switch (sabor.toUpperCase()){
            case "4 QUEIJOS":
                this.adicionarIngrediente("cheddar");
                this.adicionarIngrediente("Catupiry");
                this.adicionarIngrediente("Provolone");
                break;

            case "CALABRESA":
                this.adicionarIngrediente("Calabresa");
                break;

            case "FRANGO C/ CATUPIRY":
                this.adicionarIngrediente("Frango");
                this.adicionarIngrediente("Catupiry");

            case "MARGUERITA":
                this.adicionarIngrediente("Tomate");
                this.adicionarIngrediente("Majericão");
                break;

            case "PORTUGUESA" :
                this.adicionarIngrediente("Prensuto");
                this.adicionarIngrediente("Cebola");
                this.adicionarIngrediente("Ovo");
                break;
        }
    }

    public void getBordaRecheada(boolean bordaRecheada){

        this.bordaRecheada = bordaRecheada;
    }

    public  boolean isBordaRecheada(){
        return this.bordaRecheada;
    }

    public void setSabordeborda(String sabordeborda){
        this.sabordeborda = sabordeborda;
    }
    public String getSabordeborda(){
        return this.sabordeborda;
    }

    public void setSabor(String sabor){
        this.sabor = sabor;
    }
    public String getSabor(){
        return this.sabor;
    }

    public String getBordaRecheada() {
        return null;
    }
}
