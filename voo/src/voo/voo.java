package voo;

public class voo {
    public String[][] codificacaoAssent;
    public boolean[][] ocupacaodeAssentos;

    public voo(int linhas , int cadeirasPorLinha){

        this.ocupacaodeAssentos = new boolean[linhas][cadeirasPorLinha];
        this.codificacaoAssent = new String[linhas][cadeirasPorLinha];
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for(int i = 0;i < linhas ;i++ ){
            for(int k = 0; k < cadeirasPorLinha;k++){
                this.codificacaoAssent[i][k] = String.valueOf(alfabeto.charAt(i)) + String.valueOf(k+1)+" ";
            }
        }
        for(int i = 0;i < linhas ;i++ ){
            for(int k = 0; k < cadeirasPorLinha;k++) {
                System.out.print(this.codificacaoAssent[i][k]);
            }
            System.out.println();
        }
    }

    public boolean verificaOcupacao(String codigo) {
        int posicao = 0;
        boolean vazio = true;
for (int i = 0; i <this.codificacaoAssent.length ; i++){
    for (int k = 0; k < codificacaoAssent[i].length; k++){
        if (codigo.equals(codificacaoAssent.length)){
            System.out.println("Acento ocupado");

        }else {
            System.out.println(codificacaoAssent[i][k] + "Acento livre");
        }
    }
}
        return false;
    }



    public void ocupar(String posicao){
//se ta falo vai para true
        if (posicao == null){
            System.out.println("ACENTO OCUPADO");
        }
    }

    public int quantidadeLivre() {
        return 0;

    }

    public void mostrarAssento(){

    }

}
