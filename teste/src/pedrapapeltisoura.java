import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class pedrapapeltisoura {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int escolha = 0, bot = 0;

        int pontos_jogador = 0;
        int pontos_bot = 0;

        System.out.println(">>>>>>Pedra|Papel|Tesoura<<<<<<");
        while (pontos_jogador < 10 && pontos_bot < 10)  {

            System.out.println("");
            System.out.println("1.PEDRA :/");
            System.out.println("2.PAPEL :|");
            System.out.println("3.TESOURA  :]");
            System.out.println("");
            System.out.println("Escolhe um ai:   ");
            int valor_errado = 0;
            while(valor_errado == 0 ){
            escolha = in.nextInt();
            System.out.println("");


            switch (escolha) {
                case 1:
                    System.out.println("Você escolheu Pedra. ");
                    valor_errado = 1;
                    break;
                case 2:
                    System.out.println("Você escolheu papel");
                    valor_errado = 1;
                    break;
                case 3:
                    System.out.println("Você escolheu Tesoura");
                    valor_errado = 1;
                    break;
                default:
                    System.out.println("");
                    System.out.println("Não existe essa opção!  ª_ª n sabe ler?");
            }
            }
            bot = (int) (Math.random() * 3 + 1);
            switch (bot) {
                case 1:
                    System.out.println("O BOT escolheu Pedra. ");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("                                                    \n" +
                            "                           ###                      \n" +
                            "                       #iiiiiiiiiif                 \n" +
                            "                     ##iiiiiiiiiiiff#               \n" +
                            "                   ##iiiiiiiiiiiifff##              \n" +
                            "                 ##iiiiiiiiiiiiiiffffff#            \n" +
                            "               ###iiiiiiiiiiiiiiiffffff#W           \n" +
                            "              ###iiiiiiiiiiiiiiiiffffff###          \n" +
                            "             ##iiiiiiiiiiiiiiiifffffffff###         \n" +
                            "            ##iiiiiiiiiiiiiiifffffffffff###         \n" +
                            "           ##iiiiiiiiiiiiiiifffffffffffDDDD         \n" +
                            "           ##iiiiiiiiiiiiiffffffffffffDD###         \n" +
                            "           #iiiiiiiiiiiiiffffffffffffDDD###         \n" +
                            "            ##ffffffffffffffffffDDDDDDDD##          \n" +
                            "             ##ffffffffffffffffDDDDDDDD##           \n" +
                            "              ##fffffffffffffffDDDDDDD##            \n" +
                            "                #fffffffffffffDDDDDDDD#             \n" +
                            "                 #fffffffffffDDDDDDDK##             \n" +
                            "                    fffffffDDDDDD###                \n" +
                            "                     ffffffDDDDDD##                 \n" +
                            "                         ######                     \n" +
                            "                                                    \n");
                    break;
                case 2:
                    System.out.println("O BOT escolheu papel");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("\n" +
                            "                            ##                        \n" +
                            "                          #####t                      \n" +
                            "                        i##    ##                     \n" +
                            "                       ##       i##                   \n" +
                            "                     D##          ##i                 \n" +
                            "                    ##       ##.    ##                \n" +
                            "                  ###       ##       ##K              \n" +
                            "                i##       L##   L#     ##             \n" +
                            "               ##        ##    ##       #D            \n" +
                            "             L##        ##    ##  WG   L#             \n" +
                            "            ##        ##    ##; ##     #              \n" +
                            "          ##;        ##    ##     #   #               \n" +
                            "         #    D### ##t   L#          ##               \n" +
                            "         #   .   ### ##    #       ##W                \n" +
                            "         W#  ##    ##t##E  W#     ##K                 \n" +
                            "          ##  E##;   ## ##  #.   ##                   \n" +
                            "           f##  .##E  ## t# L#  ##                    \n" +
                            "             W#,  :##W #  #,,#j##                     \n" +
                            "               ##.   ##W  i#W##i                      \n" +
                            "                ;##        ###                        \n" +
                            "                  ###     f##                         \n" +
                            "                    G##E  #E                          \n" +
                            "                      D###K                           \n" +
                            "\n");
                    break;
                case 3:
                    System.out.println("O BOT escolheu Tesoura");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("\n" +
                            "                              D                      \n" +
                            "                            D,                       \n" +
                            "                           D,                        \n" +
                            "                          G.i     E                  \n" +
                            "                         D.,     ,                   \n" +
                            "                         t.:j   D:D                  \n" +
                            "                        t.,   ,.D                    \n" +
                            "                       D:.i D;:,                     \n" +
                            "                       i.,ED,:.                      \n" +
                            "                      iD,..t                         \n" +
                            "            WWW      Di,:iD                          \n" +
                            "         WWWiWWW  WtKiiiDD                           \n" +
                            "         Wi  LLjtWWjjWDDL                            \n" +
                            "        Wj   LjWK    KjW                             \n" +
                            "        WjjjLW     WjjW                              \n" +
                            "         WWW       jjjD                              \n" +
                            "                   jjjjW                             \n" +
                            "                  WjWWLi                             \n" +
                            "                  DL  LiW                            \n" +
                            "                  jW  fjW                            \n" +
                            "                  WjW  WjW                           \n" +
                            "                  WjiitW                             \n" +
                            "                    WW                               ");
                    break;

            }
            System.out.println("");
            if (escolha == bot) {
                System.out.println("CARA VOCÊ EMPATOU COM UM BOT!!!! KKKKKKKKKKKKK");
                System.out.println("voçê fez: " + pontos_jogador +" pontos " + " O bot fez: " + pontos_bot  );
                System.out.println("");
            } else {
                if (escolha == 1 && bot == 3 || (escolha == 2 && bot == 1 || (escolha == 3 && bot == 2))) {
                    System.out.println("PARABÉNS VOCÊ GANHOU!!!   mas foi de um bot");
                    pontos_jogador++;
                    System.out.println("voçê fez: " + pontos_jogador +" pontos " + " O bot fez: " + pontos_bot );
                    System.out.println("");

                } else {
                    System.out.println("VOCÊ PERDEU PARA UM BOT!!! KKKKKKKKKKKKKKKKKKKK");
                    pontos_bot++;
                    System.out.println("voçê fez: " + pontos_jogador +" pontos " + " O bot fez: " + pontos_bot  );
                    System.out.println("");

                }
            }
        }
        if (pontos_bot == 10) {
            System.out.println("VOÇÊ PERDEU!!KKKKK");
            System.out.println(" ");
            System.out.println("O bot fez: " + pontos_bot + " pontos e voçê fez: " + pontos_jogador + " pontos");
        }else {
            System.out.println("VOCÊ GANHOU!!   ;]");
            System.out.println("voçê fez: " + pontos_jogador +" pontos " + " O bot fez: " + pontos_bot   );

        }

    }
}


