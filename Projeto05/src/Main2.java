import java.util.HashMap;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Double> produtos = new HashMap<>();
        boolean executa = true;

        while (executa) {
            System.out.println("Menu:");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Para buscar produtos");
            System.out.println("3 - Mostrar produtos na lista");
            System.out.println("0 - Sair");
            System.out.println();
            System.out.println("Escolha: ");
            int escolha = in.nextInt();
            in.nextLine();

            switch (escolha) {
                case 0:
                    executa = false;
                    break;

                case 1:
                    System.out.println("Informe o produto: ");
                    String chave = in.nextLine();
                    if (produtos.containsKey(chave)) {
                        System.out.println("Produto já existente, Deseja alterar o valor do produto? (S/N) ");
                        if (in.nextLine().equalsIgnoreCase("N")) {
                            continue;
                        }
                    }
                    System.out.println("Informe o valor: ");
                    double valor = in.nextDouble();
                    produtos.put(chave.toLowerCase(), valor);
                    break;


                case 2:
                    if (produtos.isEmpty()) {
                        System.out.println("Não há produtos cadastrados");


                    } else {
                        System.out.println("Informe o produto: ");
                        String busca = in.nextLine().toLowerCase();


                        if (produtos.containsKey(busca)) {
                            System.out.println(busca + " : " + produtos.get(busca));
                            System.out.println();

                        } else {
                            System.out.println("Produto ' " + busca + "'não encontrada");

                        }

                    }

                    break;

                case 3:
                    System.out.println(produtos);
                    break;


                case 4:
                    if (produtos.isEmpty()) {
                        System.out.println("Não há produtos cadastrados");


                    } else {
                        System.out.println("Informe o produto: ");
                        String excluir = in.nextLine().toLowerCase();

                        if (produtos.containsKey(excluir)) {
                            produtos.remove(excluir);

                        } else {
                            System.out.println("Produto ' " + excluir + "'não encontrada");

                        }

                    }
                default:
                    System.out.println("Informe uma opção válida!");
                    break;
            }


            System.out.println(produtos);
        }

    }
}
