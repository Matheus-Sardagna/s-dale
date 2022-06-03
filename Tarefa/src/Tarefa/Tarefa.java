package Tarefa;

import java.util.UUID;

public class Tarefa {

    private String uuid;

    private String nome;

    private String descrica;

    private boolean completa;

    private int ordem;

    public Tarefa() {
        this.setUuid(UUID.randomUUID().toString());

    }


    public void completra() {
        setCompleta(true);
    }

    //gets e sets

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

        public String getUuid () {
            return this.uuid;
        }

        public void setNome (String nome){
            this.nome = nome;
        }

        public String getNome () {
            return this.nome;
        }

        public void setDescrica (String descrica){
            this.descrica = descrica;
        }

        public String getDescrica () {
            return this.descrica;
        }

        public boolean getCompleta () {
            return this.completa;
        }

        public int getOrdem () {
            return this.ordem;
        }

        public void setOrdem ( int ordem){
            this.ordem = ordem;
        }
        //cabouu


    public void setCompleta(boolean completa) {
        this.completa = completa;
    }
}


