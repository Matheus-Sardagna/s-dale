import java.util.Scanner;

public class pin {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu número pin:  ");
        int pin = input.nextInt();
        int pin2 = 25434;

        for( int i = 3; i > 0 ; i--){
            if (pin != pin2){
                System.out.print("Você errou o PIN,tente denovo!");
                pin = input.nextInt();
            }else{
                System.out.println("Você acertou o PIN!!  "+ pin2);
            }

        }

    }
}
