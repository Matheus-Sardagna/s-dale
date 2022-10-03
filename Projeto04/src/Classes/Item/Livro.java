package Classes.Item;

public class Livro extends Item {
    private String autor;
    private int qtdDePaginas;
    private int anoPulicacao;

    private int ediçao;


    //GETTERS & SETTERS


    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQtdDePaginas() {
        return qtdDePaginas;
    }

    public void setQtdDePaginas(int qtdDePaginas) {
        this.qtdDePaginas = qtdDePaginas;
    }

    public int getAnoPulicacao() {
        return anoPulicacao;
    }

    public void setAnoPulicacao(int anoPulicacao) {
        this.anoPulicacao = anoPulicacao;
    }

    public int getEdiçao() {
        return ediçao;
    }

    public void setEdiçao(int ediçao) {
        this.ediçao = ediçao;
    }
}
