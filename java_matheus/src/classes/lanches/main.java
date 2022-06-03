package classes.lanches;

import classes.cliente.Cliente;

import java.util.Scanner;

public class main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        Cliente cl  = new Cliente();
        System.out.println("Insira o nome do cliente: ");
        cl.setNome(in.nextLine());
        for (int i = 0 ; i <  10; i++){
            cl.getPedido().adicionarLanche(montarLanche());
            if (i == 9){
                break;
            }
            System.out.println("Deseja mais um lanche? (S/N)");
            if (in.nextLine().equalsIgnoreCase("N")){
                break;
            }
        }
        System.out.println("Cliente: "+cl.getNome());
        cl.getPedido().imprimirComanda();
    }
private static lanche montarLanche(){
    System.out.println("-MENU: Escolha uma opção-");
    System.out.println("(1) - X-salada");
    System.out.println("(2) - X-Burguer");
    System.out.println("(3) - Misto quente");
    System.out.println("(4) - Hot Dog");
    System.out.println("(5) - Mini Pizza");
    System.out.println("(6) Pizza");
    System.out.println("Escolha: ");
    int escolha = in.nextInt();
    lanche lanche = null;
    switch (escolha) {
        case 1:
            lanche = new xsalada();




            break;
        case 2:
            lanche = new Xburger();
            break;

        case 3:
            lanche = new Mistoquente();
            break;


        case 4:
            lanche = new hotDog();

            break;

        case 5:
            lanche = new miniPizza();

            break;

        case 6:
            lanche = new Pizza();

            break;

        default:
            System.err.println("Escolha uma opção válida!");
            break;

    }
    if (escolha == 1 || escolha ==2){
        System.out.println("Lanche aberto? (S/N)");
        in.nextLine();
        String aberto = in.next();
        ((Xburger )lanche).setAberto(aberto.equalsIgnoreCase("S"));
        System.out.println("Você quer adicionar mais algo em seu lanche? (S/N)");
        in.nextLine();
        String adicionar = in.next();
        if (adicionar.toUpperCase().equals("S")){
            for (int i = 0; i < 10; i++){
                System.out.println("Quais são esses ingredientes adicionais? SE não quiser digite 0 ");
                in.nextLine();
                String escolhaAdicionais = in.next();
                if (escolhaAdicionais.equals("0")){
                    break;
                }
                ((Sanduiche)lanche).adicionarAdicional(escolhaAdicionais);


            }
        }



    } else if (escolha == 3 || escolha == 4) {
        System.out.println("Você quer adicionar mais algo em seu lanche? (S/N)");
        in.nextLine();
        String adicionar = in.next(); // valor para atribuir se quer ou não quer adicionais
        if (adicionar.toUpperCase().equals("S")){
            for (int i = 0; i < 10; i++){
                System.out.println("Quais são esses ingredientes adicionais? ");
                String escolhaAdicionais = in.next();
                if (escolhaAdicionais.equals("0")){
                    break;
                }
                ((Sanduiche)lanche).adicionarAdicional(escolhaAdicionais);

            }
        }


    } else if (escolha >= 5) {
        System.out.println("Qual sabor você deseja? ");
        System.out.println("(1) - 4 Queijos");
        System.out.println("(2) - Calabresa");
        System.out.println("(3) Frango c/ catupiry");
        System.out.println("(4) - Marguerita");
        System.out.println("(5) - Portuguesa");

        int sabor = in.nextInt();
        in.nextLine();
        miniPizza miniPizza = ((classes.lanches.miniPizza) lanche);
        switch (sabor) {
            case 1:
                miniPizza.adicionarSaborEIngredientes("4 queijos");
                break;
            case 2:
                miniPizza.adicionarSaborEIngredientes("Calabresa");
                break;

            case 3:
                miniPizza.adicionarSaborEIngredientes("frango c/ catupiry");
                break;

            case 4:
                miniPizza.adicionarSaborEIngredientes("marguerita");
                break;

            case 5:
                miniPizza.adicionarSaborEIngredientes("Portuguesa");
                break;

            default:
                System.err.println("Escolha um sabor válido");
                break;
        }

        if (escolha == 6) {
            System.out.println("Informe o tamanho da pizza: ");
            System.out.println("XS - broto");
            System.out.println("SM - pequena");
            System.out.println("MD - média");
            System.out.println("LG - grande");
            System.out.println("XL - familía");
            ((Pizza)lanche).setTamanho(in.nextLine().toUpperCase());

        }

        System.out.println("Com borda recheada? (S/N)");
        String bordarecheada = in.nextLine();
        ((miniPizza)lanche).getBordaRecheada( bordarecheada.equalsIgnoreCase("S"));

        if (miniPizza.isBordaRecheada()){
            System.out.println("Qual sabor?");
            miniPizza.setSabordeborda(in.nextLine());
        }


        System.out.println();

    }
    System.out.println("Infome o valor do "+lanche.getTipo()+": R$");
    lanche.setValor(in.nextDouble());
    in.nextLine();
    return lanche;
}
}

