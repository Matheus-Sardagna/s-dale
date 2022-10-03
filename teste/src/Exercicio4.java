import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Qual tabuada você deseja saber?");
        int valor = input.nextInt();

        while (valor != 0){
            for (int i = 0; i <= 10; i++) {
                System.out.println(valor * i);
            }
            System.out.println("Qual tabuada quer saber?");
            valor = input.nextInt();
        }

        }
    }

