package Viagem;

import java.util.ArrayList;

public class Aviao implements MeioTransporte {
    private ArrayList<AssentoVoo> assentos = new ArrayList<>();
    public ArrayList<AssentoVoo> getAssentos() {
        return assentos;
    }

    public void setAssentos(ArrayList<AssentoVoo> assentos) {
        this.assentos = assentos;
    }





    public Aviao(int linhaCadeirasLuxo , int linhaCadeirasEconomicas) {
        for (int i = 1; i <= 4 * linhaCadeirasLuxo; i++) {
            AssentoVoo a = new AssentoVoo();
            a.setClasse(ClasseAssentoVoo.Luxo);
            assentos.add(a);
        }
        for (int i = 0; i < 6 * linhaCadeirasEconomicas; i++){
            AssentoVoo a = new AssentoVoo();
            a.setClasse(ClasseAssentoVoo.Economica);
            assentos.add(a);
        }
    }


    //Getrs and Setrs


    @Override
    public boolean verificaOcupacao(String Verificar) {
        for (AssentoVoo a : this.assentos) {
            if (a.getCodigo().equalsIgnoreCase(Verificar)) {
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

    public Assento getAssento(String assento, ClasseAssentoVoo classe) {
        for (AssentoVoo a : this.assentos) {
            if (a.getCodigo().equalsIgnoreCase(assento) && a.getClasse().equals(classe)) {
                return a;
            }

        }
        return null;
    }
}
