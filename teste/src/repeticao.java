public class repeticao {
    public static void main(String[] args) {
        String[] palavras = {"abc", "def", "ghi"};
        char letraproibida = 'a';
        boolean achou = false;
        for (String palavra : palavras){
            for (int i = 0; i < palavra.length(); i++){
                achou = palavra.charAt(i) == letraproibida;
                if (achou) {
                    break;
                }
            }
            if (achou) {
                break;
            }

        }
        if (achou){
            System.out.println("Encontrou letra proibida");
        }else {
            System.out.println("Não encontrou letra proibida");
        }
    }









}

