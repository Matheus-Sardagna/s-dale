import classes.*;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("-MENU: Escolha uma opção-");
        System.out.println("(1) - X-salada");
        System.out.println("(2) - X-Burguer");
        System.out.println("(3) - Misto quente");
        System.out.println("(4) - Hot Dog");
        System.out.println("(5) - Mini Pizza");
        System.out.println(" ");
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


            default:
                System.err.println("Escolha uma opção válida!");
                break;

        }
        if (escolha == 1 || escolha ==2){
            System.out.println("Lanche aberto? (S/N)");
            in.nextLine();
            String aberto = in.next();
            ((Xburger )lanche).aberto = aberto.equalsIgnoreCase("S");
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
                    ((sanduiche)lanche).adicionarAdicional(escolhaAdicionais);


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
                    ((sanduiche)lanche).adicionarAdicional(escolhaAdicionais);

                }
            }


        } else if (escolha == 5) {
            System.out.println("Com borda recheada? (S/N)");
            in.nextLine();
            String bordarecheada = in.nextLine();
            miniPizza miniPizza = ((classes.miniPizza) lanche);
            ((miniPizza)lanche).bordaRecheada = bordarecheada.equalsIgnoreCase("S");

            if (((miniPizza) lanche).bordaRecheada){
                System.out.println("Qual sabor sabor?");
                miniPizza.sabordeborda = in.nextLine();
            }

            System.out.println();

        }
        System.out.println("Infome o valor do "+lanche.tipo+": R$");
        lanche.valor = in.nextDouble();
        lanche.montarComanda();

    }

}

