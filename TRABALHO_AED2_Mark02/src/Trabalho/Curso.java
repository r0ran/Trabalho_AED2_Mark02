package Trabalho;

public class Curso {
    private String nome;
    private String codigo;

    public Curso(String nome, String codigo) {
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
        return "Curso: " + nome + ", Código: " + codigo;
    }
}