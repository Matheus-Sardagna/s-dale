package Viagem;

import java.util.ArrayList;

public class Onibus implements MeioTransporte {
    private ArrayList<AssentoOnibus> assentos = new ArrayList<>();

    public ArrayList<AssentoOnibus> getAssentos() {
        return assentos;
    }

    public void setAssentos(ArrayList<AssentoOnibus> assentos) {
        this.assentos = assentos;
    }

    public Onibus(int linhaCadeiras) {
        for (int i = 1; i <= 4 * linhaCadeiras; i++) {
            AssentoOnibus a = new AssentoOnibus();
            a.setLugar(String.valueOf(i));
            assentos.add(a);
        }
    }

    private boolean leito;

    public boolean isLeito() {
        return leito;
    }

    public void setLeito(boolean leito) {
        this.leito = leito;
    }

    @Override
    public boolean verificaOcupacao(String Verificar) {
        for (AssentoOnibus a : this.assentos) {
            if (a.getLugar().equalsIgnoreCase(Verificar)) {
                return a.isOcupado();
            }
        }
        return false;
    }


    @Override
    public int quantidadelivre() {
        int assentosLivres = 0;
        for (AssentoOnibus a : this.assentos) {
            if (!a.isOcupado()) {
                assentosLivres++;

            }
        }
        return assentosLivres;
    }

    @Override
    public void mostrarAssentos() {
        int i = 0;
        for (AssentoOnibus a : this.assentos) {
            i++;
            if (a.isOcupado()) System.out.print("[XX] ");
            else {
                if (a.getLugar().length() < 2) System.out.print("[0" + a.getLugar() + "] ");
                else System.out.print("[" + a.getLugar() + "] ");
            }
            if (i == 2) System.out.print("|| ");
            else if (i == 4) {
                System.out.println();
                i = 0;


            }
        }

    }

    @Override
    public Assento getAssento(String assento) {
        for (AssentoOnibus a : this.assentos) {
            if (a.getLugar().equalsIgnoreCase(assento)) {
                return a;
            }

        }


        return null;

    }

}
