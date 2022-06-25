import Viagem.Aviao;
import Viagem.Onibus;

public class Main {
    public static void main(String[] args) {
        Onibus onibus = new Onibus(3);

        onibus.getAssento("4").setOcupado(true);
        onibus.mostrarAssentos();


    }
}
