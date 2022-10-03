import java.util.Scanner;

public class Matheus {

    //comentario de linhas
    /*comentario de tendi menor

     */

    public static void main(String[]args) {

        exer01();
        exer02();
        exer03();
        exer04();
        exer05();
        exer06();
        exer07();
        exer08();
        exer09();
        exer10();
        exer11();
        exer12();
        exer13();
        exer14();
        exer15();
        exer16();
        exer17();
        exer18();
        exer19();
        exer20();
    }
    public static void exer01() {
        int B = 10;
        int A = 20;
        int C = B;
        B = A;
        A = C;

        System.out.println(B);
        System.out.println(A);
    }
    public static void exer02(){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor");
        int valor = input.nextInt();

        System.out.println(--valor);

    }
    public static void exer03(){
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva o valor da Base:");
        double Base = input.nextDouble();

        System.out.println("Escreva o valor da Altura:");
        double Altu = input.nextDouble();

        double Area = Base * Altu;

        double perimetro = Altu * 2 + Base *2;

        System.out.printf("A área é: %.2f"+Area);
        System.out.printf("O períemetro é: %.2f"+perimetro);
    }
    public static void exer04(){
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva sua idade:");
        int idade = input.nextInt();

        System.out.println("Escrev quatos meses:");
        int meses = input.nextInt();

        System.out.println("Escreva quantos dias");
        int dias = input.nextInt();

        int Dias_vividos = 0;
        Dias_vividos += idade * 365;
        Dias_vividos += meses * 30;
        Dias_vividos += dias;

        System.out.println("Você tem dias vividos:"+ Dias_vividos);

    }

    public static void exer05(){
        Scanner  input  = new Scanner(System.in);

        System.out.println("Escreva o número de eleitores:");
        int numr_eleitores = input.nextInt();

        System.out.println("Escreva quantos votos Brancos teve:");
        int votos_brancos = input.nextInt();

        System.out.println("Escreva quantos votos nulos teve:");
        int votos_nulos = input.nextInt();

        System.out.println();

    }

    public static void exer06(){
        Scanner input = new Scanner(System.in);

        System.out.printf("Escreva o valor do salário: ");
        double salario = input.nextDouble();

        System.out.println("Escreve o valor da procentagem");
        double porcentagem = input.nextDouble();

        double valor_do_aumento = salario / 100 * porcentagem;

        double salario_aumentado = valor_do_aumento + salario;

        System.out.printf("O valor da dos eu novo salário é:R$ %.2f ", salario_aumentado);



    }
    public static void exer07() {
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva o custo do carro de fábrica ");
        double custo_de_fabrica = input.nextDouble();

        System.out.println("Ecreva o percentual do ditribuidor: ");
        double percentual_c = input.nextDouble();

        System.out.println("Escreva o percentual de imposto");
        double perncentual_i = input.nextDouble();

        double custo_docar = custo_de_fabrica + ((custo_de_fabrica /100) * 28) + ((custo_de_fabrica / 100) * 45 );

        System.out.printf("o valor do carro será: %.2f", custo_docar);

    }

    public static void exer08(){
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva quanto ganha o funcionário: ");
        double salario = input.nextDouble();

        System.out.println("Escreva quantos carros foram vendidos: ");
        int carros_vendidos = input.nextInt();

        System.out.println("Escreva valor total das venda: ");
        double valort_carrosvendido = input.nextDouble();

        System.out.println("Valor da comissão fixa: ");
        double valor_da_comi_fixa = input.nextDouble();

        double valorc = valort_carrosvendido / 100 * 5;

        double salario_final = valorc + salario + valor_da_comi_fixa * carros_vendidos;

        System.out.printf("Salário do funcionário será: %.2f", salario_final);


    }





    public static void exer09() {
        Scanner input = new Scanner(System.in);

        System.out.printf("Escreva o valor da temperatura:");
        double temp_f = input.nextDouble();

        double temp_c = (temp_f - 32)  / 9 * 5;

        System.out.printf("%.2f"+ temp_c);




    }

    public static void exer10( ){
        Scanner input =  new Scanner(System.in);
        System.out.printf("Escreva o valor da primeira nota: ");
        double n1 = input.nextDouble();

        System.out.printf("Escreva a segunda nota");
        double n2 = input.nextDouble();

        System.out.printf("Escreva o valor da terceira nota:");
        double n3 = input.nextDouble();

        double nota_final = n1 * 2 + n2 *3 + n3 * 5 / 10;

        System.out.printf("Sua média final é: %.2f", nota_final);

    }

    public static void exer11(){
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva um valor");
        int valor = input.nextInt();

        if (valor > 10){
            System.out.println("O valor não é maior que 10!!");
        } else if (valor < 10) {
            System.out.println("Valor é menor que 10!!");
            
        } else if (valor ==  10) {
            System.out.println("Valor é igual a 10!!");

        }


    }
    public static void exer12(){
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva o valor:  ");
        int valor = input.nextInt();

        if (valor > -1){
            System.out.println("O valor é positivo!");
        } else if (valor < 0 ) {
            System.out.println("O valor é negativo!");

        }
    }
    public static void exer13(){
        Scanner input = new Scanner(System.in);

        System.out.println("Insira a quantidade de maças venidas: ");
        int macasvendidas = input.nextInt();

        if (macasvendidas < 12){
            double valor = macasvendidas * 1.30;
            System.out.printf("O valor da compra foi:R$ %.2f", valor);


        } else if (macasvendidas >=  12) {
            double valor = macasvendidas * 1.00;
            System.out.printf("O valor da compra foi:R$ %.2f", valor);

        }
    }
public static void exer14(){
        Scanner input = new Scanner(System.in);

    System.out.println("Escreva o ano atual: ");
    int ano_atual = input.nextInt();

    System.out.println("Qual ano você nasceu?");
    int nascimento = input.nextInt();

    if (nascimento >= 16){
        System.out.println("Você pode votar!!");

    } else if (nascimento <= 16) {
        System.out.println("Você pode votar esse ano!!!");

    }


}
public static void exer15(){
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva o primeiro número:");
        int valor1 = input.nextInt();


        System.out.println("Escreva o segundo número:");
        int valor2 = input.nextInt();

        if (valor1 > valor2){
            System.out.println(valor1);

        } else if (valor2 > valor1) {
            System.out.println(valor2);

        }
}

public static void exer16(){
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva o primeiro valor: ");
        int valor1 = input.nextInt();

        System.out.println("Escreva o segundo valor: ");
        int valor2 = input.nextInt();

        if (valor1 > valor2){
            System.out.println(valor2 + valor1);

        } else if (valor2 > valor1) {
            System.out.println(valor1 + valor2);

        }



}
public static void exer17() {

}
public static void exer18(){
        Scanner input =  new Scanner(System.in);

        System.out.println("Ecreva o valor do salario diário");
        double salario_ph = input.nextDouble();

        System.out.println("Escreva quantas horas extras o funcionário trabalhou ");
        double  horas = input.nextDouble();


        if (horas > 40){
            double salario_ex = salario_ph * horas;
            double salario_mensal = ((salario_ex * 24) / 100) * 50 ;
            System.out.println("Seu salário esse mês será de : R$ %.2f");

        }else if(horas < 40) {
            double salario_mensal = (salario_ph * horas) /  2 ;
            System.out.printf("Seu salário esse mês será de : R$ %.2f");
        }



        else {
         double salario = (salario_ph * horas) * 30;
            System.out.printf("Seu sálario desse mes será de :R$ %.2f");
        }



}
public static void exer19() {
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva seu nome: ");
        String nome = input.nextLine();
        nome = nome.toUpperCase();


        System.out.println("Escreva sua altura: ");
        double altura = input.nextDouble();


        System.out.println("Defina seu sexo (M) masculino ou (F) feminino:");
        String sexo = input.nextLine();
        sexo = sexo.toUpperCase();

        if (sexo == "M") {
            double peso_ideal = (72.7 * altura) - 58;
            System.out.printf("Seu peso ideal é: %.2f",peso_ideal);


        } else{
            double peso_ideal = (62.1 * altura) - 44.7;
            System.out.printf("Seu peso ideal é: %.2f", peso_ideal);

        }


}
public static void exer20(){
        Scanner input = new Scanner(System.in);


        System.out.println("Insira o valor do salario:");
        double salario_f = input.nextDouble();


        System.out.println("Insira quantas vendas o funcionário fez: ");
        int vendas = input.nextInt();


        System.out.println("Insira o valor das vendas: ");
        double valor_devendas = input.nextDouble();

        if (valor_devendas < 1.500 ){
            double comissao = (valor_devendas * vendas) * 0.03;
            double salario_c = comissao + salario_f;

            System.out.printf("Seu salário atual será:R$ %.2f", salario_c);


        } else {
            double comissao = (valor_devendas * vendas ) * 0.05;
            double salario_c = comissao + salario_f;

            System.out.printf("Seu salário atual será: R$ %.2f", salario_c);

        }


}
public static void exer21(){

}

}