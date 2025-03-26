package Trabalho;

public class Curso {
    private int matricula;
    private int codigoCurso;
    private float nota1;
    private float nota2;

    public Curso(int matricula, int codigoCurso, float nota1, float nota2) {
        this.matricula = matricula;
        this.codigoCurso = codigoCurso;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public float getNota1() {
        return nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public String toString() {    // isso serve pra exibir uma representação legível do objeto(n sei se vamos usar mas ta aí)
        return "Curso [Matrícula: " + matricula + ", Código do Curso: " + codigoCurso +
               ", Nota1: " + nota1 + ", Nota2: " + nota2 + "]";
    }
}