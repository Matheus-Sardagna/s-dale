import Viagem.Aviao;
import Viagem.Onibus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Onibus onibus = new Onibus(3);

        System.out.println("Escreva em qual assento você quer usar: ");
        onibus.getAssento(in.next()).setOcupado(true);
        onibus.mostrarAssentos();


    }
}
