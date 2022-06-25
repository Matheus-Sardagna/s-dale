import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ex3();

    }

    public static void ex1() {

        ArrayList inteiros = new ArrayList();
        while (true) {
            System.out.println("Informe um valor inteiro: ");
            int escolha = in.nextInt();
            inteiros.add(escolha);
            if (escolha == 0) {
                break;
            }
        }
        System.out.println("Valores informados: ");
        System.out.println(inteiros);
    }

    public static void ex2() {
        int somaPar = 0, somaImpar = 0;
        double somaTotal = 0.0;
        ArrayList<Integer> inteiros = new ArrayList<>();
        while (true) {
            System.out.println("Informe um valor inteiro: ");
            int escolha = in.nextInt();
            if (escolha % 2 == 0) {
                somaPar += escolha;
            } else {
                somaImpar += escolha;
            }
            somaTotal += escolha;
            inteiros.add(escolha);
            if (escolha == 0) {
                break;
            }
        }


        System.out.println("Valores informados: " + inteiros);
        System.out.println("Soma dos valores Pares: " + somaPar);
        System.out.println("Soma dos valores Impares: " + somaImpar);
        System.out.println("Soma de todos os valores: " + somaTotal);
        System.out.println("Média dos valores informados: " + (somaTotal / inteiros.size()));
    }

    public static void ex3() {
        ArrayList<String> palavra = new ArrayList<>();
        while (true) {
            System.out.println("Escolha uma palavra pra atribuir(SAIR para sair): ");
            String input = in.nextLine();
            palavra.add(input);
            if (input.equalsIgnoreCase("SAIR")) {
                break;
            }

        }
        System.out.println("Escolha quantas caracters para retirar a palavra da lista");
        int qntdCaracter = in.nextInt();

        for (int i = 0; i < palavra.size(); i++) {
            if (palavra.get(i).length() < qntdCaracter) {
                palavra.remove(i);
                i--;

            }
        }
        System.out.println("Suas palavras: ");
        System.out.println(palavra);

    }
}



