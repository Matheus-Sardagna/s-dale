package Tarefa;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner in =  new Scanner(System.in);
        Tarefa t = new Tarefa();

        System.out.println("Infome o nome da tarefa: ");
        t.setNome(in.nextLine());
        System.out.println("Infome a descrição da tarefa: ");
        t.setDescrica(in.nextLine());

        System.out.println(t.getUuid());
        System.out.println(t.getNome());
        System.out.println(t.getDescrica());

    }
}
