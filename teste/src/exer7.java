import java.util.Scanner;

public class exer7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int quantidade =  0;
        System.out.println("Digite uma frase: ");
        input.nextLine();
        String frase = input.nextLine();

        for (int i = 0; i < frase.length(); i++ ) {
            if (frase.charAt(i) == ' ')quantidade++;
        }
        System.out.println();
        System.out.println("A quantidade de espaços em branco na frase digitado é" + quantidade);



            }




}
