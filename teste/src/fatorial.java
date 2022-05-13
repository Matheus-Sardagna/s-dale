import java.util.Scanner;

public class fatorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu número fatorial: ");
        int fatorial = input.nextInt();

        for(int i = fatorial; i > 1; i--){

            fatorial *= i;
        }
        System.out.println("O seu fatorial é  " + fatorial);
    }

}
