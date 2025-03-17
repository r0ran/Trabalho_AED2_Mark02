package Trabalho;

public class Disciplina {
    private String nome;
    private String codigo;

    public Disciplina(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public String toString() {
        return "Disciplina: " + nome + ", Código: " + codigo;
    }
}