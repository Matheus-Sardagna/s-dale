package classes.lanches;

public class Pizza extends miniPizza {
    private String tamanho;

    public Pizza(){
        this.setTamanho("Pizza");
    }


    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }

    public String getTamanho(){
        return this.tamanho;
    }

}
