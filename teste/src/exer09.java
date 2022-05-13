import java.util.Scanner;

public class exer09 {
    public static void main(){
        Scanner input = new Scanner(System.in);

        System.out.println("Ecolha ");
        int nmr = input.nextInt();
        int [] numero = new int[nmr];
        int soma  = 0 ;

        for (int i = 0; i < nmr ; i++){
            System.out.println("Digite os números que o usuário deseja somar: ");
            numero[i] = input.nextInt();
            soma += numero[i];

        }
        System.out.println();
        System.out.println("O valor total da soma é: " + soma);
    }
}
