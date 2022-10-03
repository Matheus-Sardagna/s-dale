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

    public void completar() {
        setCompletar(true);
        for (ChecklistItem item : this.getChecklist()) {
            if (item != null) {
                item.completar();
            }
        }
    }
    public void criarChecklist(int tamanho) {
        this.setChecklist(new ChecklistItem[tamanho]);

    }

    public boolean temChecklist() {

        return this.getChecklist() != null;
    }

    public boolean adicionarChecklistItem(ChecklistItem Item) {
        for (int i = 0; i < this.getChecklist().length; i++) {
            if (this.getChecklist[i] == null) {
                this.getChecklist[i] = item;
                return true;
            }
        }

        return false;
    }

    //gets e sets

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setDescrica(String descrica) {
        this.descrica = descrica;
    }

    public String getDescrica() {
        return this.descrica;
    }

    public boolean getCompletar() {
        return this.completa;
    }

    public int getOrdem() {
        return this.ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }
    //cabouu


    public void setCompletar(boolean completa) {
        this.completa = completa;
    }
}


