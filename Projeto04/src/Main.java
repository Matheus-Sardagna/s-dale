import Classes.Estante;
import Classes.Item.DVD;
import Classes.Item.Item;
import Classes.Item.Livro;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Estante estante = new Estante(5);

        for (int i = 0; i < estante.getCapMaxima(); i++) {
            int opcao = 3;
            Item item = new Item();

            while (opcao >= 3) {
                System.out.println("====Ecolha um item====");
                System.out.println("(1) DVD");
                System.out.println("(2) Livro");
                System.out.println("(0) Sair");
                System.out.println("Escolha: ");
                opcao = in.nextInt();

            }

            switch (opcao) {
                case 1:
                    item = new DVD();
                    DVD dvd = new DVD();
                    System.out.println("Escreva o nome do diretor: ");
                    dvd.setDiretor(in.nextLine());
                    in.nextLine();
                    System.out.println("Escreva a duraçao do filme: ");
                    dvd.setDuracao(in.nextDouble());
                    in.nextLine();
                    System.out.println("Escreva o ano de lançamento");
                    dvd.setAnoLancamento(in.nextInt());
                    in.nextLine();
                    break;


                case 2:
                    Livro livro = new Livro();
                    System.out.println("Escreva o nome do autor: ");
                    livro.setAutor(in.nextLine());
                    in.nextLine();
                    System.out.println("Escreva a quantidade de páginas do livro: ");
                    livro.setQtdDePaginas(in.nextInt());
                    in.nextLine();
                    System.out.println("Escreva o ano que o livro foi púlicado: ");
                    livro.setAnoPulicacao(in.nextInt());
                    in.nextLine();
                    item = new Livro();
                    break;


                case 0:
                    continue;
            }

            System.out.println("Escreva o título do Item: ");
            item.setTitulo(in.nextLine());

            System.out.println("Escreva o genêro do Itme: ");
            item.setGenero(in.nextLine());
            estante.adicionarItem(item);
            System.out.println("Você tem ainda " + (estante.getCapMaxima() - estante.quantidadeItens()) + " lugares na estante ");
            for(int j = 0; j < estante.getCapMaxima(); j++) {
                Item ite = estante.getItens()[j];
                if (ite != null) {
                    System.out.println(ite.getTitulo());
                }
            }
        }
    }
}
