package Viagem;

public interface MeioTransporte {
    boolean verificaOcupacao(String Verificar);

    int quantidadelivre();

    void mostrarAssentos();

    Assento getAssento(String assento);


}
