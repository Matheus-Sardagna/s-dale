package classes.lanches;

public abstract class Sanduiche extends lanche {

    private String[] adicional = new String[10];


    public void adicionarAdicional(String adicionar) {
        for (int i = 0; i < 10; i++) {
            if (this.adicional[i] == null) {
                this.adicional[i] = adicionar;
                break;
            }
        }
    }

    public String[] getAdicional() {
        return adicional;
    }

    public void setAdicional(String[] adicional) {
        this.adicional = adicional;
    }

}




