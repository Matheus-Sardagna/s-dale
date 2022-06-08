import Tarefa.Tarefa;

import java.util.Scanner;

public class main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {


    }

    public static Tarefa criarTarefa() {
        Tarefa t = new Tarefa();
        System.out.println("Infome o nome da tarefa: ");
        t.setNome(in.nextLine());
        System.out.println("Infome a descrição da tarefa: ");
        t.setDescrica(in.nextLine());
        System.out.println("Ordem da tarefa: ");
        t.setOrdem(in.nextLine());
        in.nextLine();
        System.out.println("Tarefa tem checklist? (S/N)");
        System.err.println();

        System.out.println(t.getUuid());
        System.out.println(t.getNome());
        System.out.println(t.getDescrica());

        return t;
    }
}


