import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Quantas plavras você deseja inserir na lista: ");
        int valor = input.nextInt();

        String[] palavras = new String[valor];
        for (int i = 0; i  < valor; i++ ){
            System.out.println("Informe a palavra: ");
            palavras[i] = input.next();
        }
        String palavra_final = "";
        for (int i = 0; i < palavras.length; i++){
            if(i == 0 ){
                palavra_final+= palavras[i];
            }else {
                palavra_final += ", "+palavras[i];
            }
        }
        System.out.println(palavra_final);
    }

}
