package Viagem;

import java.util.ArrayList;

public class Aviao implements MeioTransporte {
    private ArrayList<AssentoVoo> assentos = new ArrayList<>();

    public Aviao(int linhaCadeiras) {
        for (int i = 1; i <= 4 * linhaCadeiras; i++) {
            AssentoVoo a = new AssentoVoo();
            a.setCodigo(String.valueOf(i));
            assentos.add(a);
        }
    }


    //Getrs and Setrs


    public ArrayList<AssentoVoo> getAssentos() {
        return assentos;
    }

    public void setAssentos(ArrayList<AssentoVoo> assentos) {
        this.assentos = assentos;
    }

    @Override
    public boolean verificaOcupacao(String Verificar) {
        for (AssentoVoo a : this.assentos) {
            if (a.getClasse().equalsIgnoreCase(Verificar)) {
                return a.isOcupado();
            }

        }
        return false;
    }

    @Override
    public int quantidadelivre() {
        int assentosLivres = 0;
        for (AssentoVoo a : this.assentos) {
            if (!a.isOcupado()) {
                assentosLivres++;

            }
        }


        return 0;
    }

    @Override
    public void mostrarAssentos() {
        int i = 0;
        for (AssentoVoo a : this.assentos) {
            i++;
            if (a.isOcupado()) System.out.println(" [XX] ");
            else {
                if (a.getCodigo().length() < 2) System.out.println("[0" + a.getCodigo() + "] ");
                else System.out.println("[" + a.getCodigo() + "] ");
            }
            if (i == 2 ) System.out.println("|| ");
            else if (i == 4) {
                System.out.println();
                i = 0;


            }
        }


    }

    @Override
    public Assento getAssento(String assento) {
        for (AssentoVoo a : this.assentos) {
            if (a.getCodigo().equalsIgnoreCase(assento)) {
                return a;
            }

        }

        return null;
    }

    public Assento getAssento(String assento, String classe) {
        for (AssentoVoo a : this.assentos) {
            if (a.getCodigo().equalsIgnoreCase(assento) && a.getClasse().equalsIgnoreCase(classe)) {
                return a;
            }

        }
        return null;
    }
}
