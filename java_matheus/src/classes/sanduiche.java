package classes;

public class sanduiche extends lanche {

    public String[] adicional = new String[10];


    public void adicionarAdicional(String adicionar) {
        for (int i = 0; i < 10; i++) {
            if (this.adicional[i] == null) {
                this.adicional[i] = adicionar;
                break;
            }
        }
    }

    @Override
    public void montarComanda() {
        super.montarComanda();
        for (String adicionar: this.adicional){
            if (adicionar != null){
                System.out.println(adicionar);
            }
        }
        System.out.println(adicional);
        System.out.println();
    }
}

