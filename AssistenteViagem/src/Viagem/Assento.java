package Viagem;


public class Assento {
    private boolean ocupado;
    private double valor;




    public void ocupar() {
        this.setOcupado(true);

        }


    //Getrs / is / Setrs

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
