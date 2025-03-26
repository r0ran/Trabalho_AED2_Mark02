package Trabalho;

public class Disciplina {
    private int codigoDisciplina;
    private String nome;
    private float notaMinima;

    public Disciplina(int codigoDisciplina, String nome, float notaMinima) {
        this.codigoDisciplina = codigoDisciplina;
        this.nome = nome;
        this.notaMinima = notaMinima;
    }

    public int getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public String getNome() {
        return nome;
    }

    public float getNotaMinima() {
        return notaMinima;
    }
    
    public String toString() {
        return "Disciplina [Código: " + codigoDisciplina + ", Nome: " + nome +
               ", Nota Mínima: " + notaMinima + "]";
    }
}