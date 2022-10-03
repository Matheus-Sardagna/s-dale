import java.util.Locale;
import java.util.Scanner;

public class codigomorse {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        int tradutor_paraLetra = 2;

        System.out.println("Digite uma frase: ");
        String frase = in.nextLine();

        frase = frase.toLowerCase();
        String encriptada = frase.replace(".", ".-.-.-").replace("a",".-|").replace("b","-...|").replace("c","-.-.|")
                .replace("d", "-..|").replace("e", ".|").replace("f", "..-.|")
                .replace("g", "--.|").replace("h", "....|").replace("i", "..|")
                .replace("j",".---|").replace("k", "-.-|").replace("l", ".-..|")
                .replace("m", "--|").replace("n", "-.|").replace("o", "---|")
                .replace("p", ".--.|").replace("q", "--.-|").replace("r", ".-.|")
                .replace("s", "...|").replace("t", "-|").replace("u", "..-|")
                .replace("v", "...-|").replace("w", ".--|").replace("x", "-..-|")
                .replace("y", "-.--|").replace("z", "--..|").replace("1" , ".----|")
                .replace("2" , "..---|").replace("3","...--|").replace("4","....-|")
                .replace("5",".....|").replace("6","-....|").replace("7","--...|")
                .replace("8","---..|").replace("9","----.|").replace("0","-----|")
                .replace(" ", "*|").replace(",", "--..--|")
                .replace("!", "-.-.--|").replace("?" , "··--··|").replace("/","-··-·|")
                .replace("(", "-·--·|").replace(")","-·--·-|").replace("$","···-··-")
                .replace("@","·--·-·|").replace("=","-···-|").replace(";","-·-·-·|")
                .replace(":","---···|").replace("é","··-··|").replace("è","·-··-").replace("ch","----")
                ;
        System.out.println(encriptada);
    }
}
