package voo;

import java.util.Scanner;



public class main extends voo{
    public main(int linhas, int cadeirasPorLinha) {
        super(linhas, cadeirasPorLinha);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insira a quantidade de linhas: ");
        int linhas = in.nextInt();
        System.out.println("Insira a quantidade de cadeiras por linhas: ");
        int cadeirasPorLinha = in.nextInt();

        voo v = new voo(linhas,cadeirasPorLinha);
        System.out.println();
        System.out.println("Escolha uma posição: ");
        in.next();
        String posicao = in.nextLine();
      v.mostrarAssento();
    }




    }