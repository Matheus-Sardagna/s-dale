import java.util.Scanner;

public class matheusnathan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva quantos alunos tem na sala: ");
        int alunos = in.nextInt();

        System.out.println("Escreva o numero de questoes: ");
        int questoes = in.nextInt();

        String[] gabarito = new String[questoes];
        String[] nomes = new String[alunos];
        String[][] respostas = new String[alunos][questoes];
        int[] nota_final = new int[alunos];


        in.nextLine();
        for (int i = 0; i < questoes; i++) {
            System.out.println("Escreva o gabarito: " + (i + 1));
            gabarito[i] = in.nextLine();
        }
        for (int k = 0; k < alunos; k++) {
            System.out.println("Escreva o nome do aluno: " + (k + 1));
            nomes[k] = in.nextLine();

            for (int i = 0; i < questoes; i++) {
                System.out.println("Escreva suas respostas: "+ (k + 1));
                respostas[k][i] = in.nextLine();
            }


        }
        for (int i = 0; i < alunos; i++) {
            int correto = 0;
            for (int j = 0; j < questoes; j++) {
                if (respostas[i][j].equals(gabarito[j])) {
                    correto += 1;
                }
            }
            nota_final[i] = 10 / questoes * correto;
            System.out.println();

        }
        for (int a = 0; a < alunos; a++) {
            System.out.println(nomes[a] + " Nota: " + nota_final[a]);


        }
    }
}







