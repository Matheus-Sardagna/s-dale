import java.util.Scanner;

public class exer08 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva o número de linhas");
        int numr_linha = input.nextInt();

        System.out.println("EScreva o numero de colunas: ");
        int nmr_coluna = input.nextInt();

        for ( int i = 0; i < nmr_coluna; i++  ){
            for (int j =0; j < numr_linha; j++){
                System.out.print("#");

            }
            System.out.println("");
        }
    }

}
