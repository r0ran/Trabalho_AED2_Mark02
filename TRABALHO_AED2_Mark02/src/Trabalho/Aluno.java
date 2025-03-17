package Trabalho;

public class Aluno {
	private String nome;
    private int matricula;
    private String curso;

    public Aluno(String nome, int matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }
    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }
 
    public String toString() {    // isso serve pra exibir uma representação legível do objeto(n sei se vamos usar mas ta aí)
        return "Aluno: " + nome + ", Matrícula: " + matricula + ", Curso: " + curso;
    }
}