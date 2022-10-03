package Tarefa;

import java.util.UUID;

public class ChecklistItem {
    private String uuid;

    private String nome;

    private String descrica;

    private boolean completa;

    private int ordem;

    private ChecklistItem[] checklist;

    public ChecklistItem() {
        this.setUuid(UUID.randomUUID().toString());
    }

    public void completar() {
        this.setCompletar(true);
        }


    public boolean temChecklist() {

        return this.getChecklist() != null;
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

    public Tarefa.ChecklistItem[] getChecklist() {
        return checklist;
    }

    public void setChecklist(Tarefa.ChecklistItem[] checklist) {
        this.checklist = checklist;
    }

    //cabouu


    public void setCompletar(boolean completa) {
        this.completa = completa;
    }

}
