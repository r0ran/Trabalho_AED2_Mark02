package Trabalho;

public class Aluno {
    private int matricula;
    private String nome;
    private int idade;

    public Aluno(int matricula, String nome, int idade) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String toString() {
        return "Aluno [Matrícula: " + matricula + ", Nome: " + nome + ", Idade: " + idade + "]";
    }
}