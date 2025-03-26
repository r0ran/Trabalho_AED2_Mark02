package Trabalho;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    private static final int TAMANHO_MAXIMO = 100; // aamanho  dos vetores
    private static Curso[] cursos = new Curso[TAMANHO_MAXIMO];
    private static Aluno[] alunos = new Aluno[TAMANHO_MAXIMO];
    private static Disciplina[] disciplinas = new Disciplina[TAMANHO_MAXIMO];
    private static int totalCursos = 0;
    private static int totalAlunos = 0;
    private static int totalDisciplinas = 0;

    public static void main(String[] args) {
        try {
            // caminho completo dos arquivos
            String caminhoBase = "C:\\Users\\user\\Desktop\\UCL\\Trabalho AED2\\";

            // le os arquivos e carregar os dados
            carregarDados(caminhoBase + "Cursos.txt", "cursos");
            carregarDados(caminhoBase + "Alunos.txt", "alunos");
            carregarDados(caminhoBase + "Disciplinas.txt", "disciplinas");

            // mostra menu
            exibirMenu();
        } catch (FileNotFoundException e) {
            System.out.println("Erro: Arquivo não encontrado. Verifique o caminho dos arquivos.");
        }
    }

    // metodo de carregar dados dos arquivos
    private static void carregarDados(String caminhoArquivo, String tipo) throws FileNotFoundException {
        File arquivo = new File(caminhoArquivo);
        Scanner scan = new Scanner(arquivo);

        while (scan.hasNextLine() && (totalCursos < TAMANHO_MAXIMO || totalAlunos < TAMANHO_MAXIMO || totalDisciplinas < TAMANHO_MAXIMO)) {
            String linha = scan.nextLine();
            String[] dados = linha.split(";"); // Supondo que os dados estão separados por ";"

            switch (tipo) {
                case "cursos":
                    if (totalCursos < TAMANHO_MAXIMO) {
                        cursos[totalCursos++] = new Curso(
                            Integer.parseInt(dados[0]), // matricula
                            Integer.parseInt(dados[1]), // código do curso
                            Float.parseFloat(dados[2]), // nota1
                            Float.parseFloat(dados[3])  // nota2
                        );
                    }
                    break;
                case "alunos":
                    if (totalAlunos < TAMANHO_MAXIMO) {
                        alunos[totalAlunos++] = new Aluno(
                            Integer.parseInt(dados[0]), // matricula
                            dados[1],                 // nome
                            Integer.parseInt(dados[2]) // idade
                        );
                    }
                    break;
                case "disciplinas":
                    if (totalDisciplinas < TAMANHO_MAXIMO) {
                        disciplinas[totalDisciplinas++] = new Disciplina(
                            Integer.parseInt(dados[0]), // codigo da disciplina
                            dados[1],                   // nome
                            Float.parseFloat(dados[2])  // nota minima
                        );
                    }
                    break;
            }
        }
        scan.close();
    }

    // metoodo para exibir o menu
    private static void exibirMenu() {
        Scanner scan = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Buscar resultados");
            System.out.println("2. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    buscarResultados(scan);
                    break;
                case 2:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 2);

        scan.close();
    }

    // metodo para buscar resultados
    private static void buscarResultados(Scanner scan) {
        System.out.println("\n--- BUSCAR RESULTADOS ---");
        System.out.println("1. Por Aluno");
        System.out.println("2. Por Disciplina");
        System.out.print("Escolha uma opção: ");
        int opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                buscarPorAluno(scan);
                break;
            case 2:
                buscarPorDisciplina(scan);
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

    // metodo para buscar por aluno
    private static void buscarPorAluno(Scanner scan) {
        System.out.print("Digite a matrícula do aluno: ");
        int matricula = scan.nextInt();

        for (int i = 0; i < totalAlunos; i++) {
            if (alunos[i].getMatricula() == matricula) {
                System.out.println(alunos[i]);
                return;
            }
        }
        System.out.println("Aluno não encontrado.");
    }

    // Método para buscar por disciplina
    private static void buscarPorDisciplina(Scanner scan) {
        System.out.print("Digite o código da disciplina: ");
        int codigoDisciplina = scan.nextInt();

        for (int i = 0; i < totalDisciplinas; i++) {
            if (disciplinas[i].getCodigoDisciplina() == codigoDisciplina) {
                System.out.println(disciplinas[i]);
                return;
            }
        }
        System.out.println("Disciplina não encontrada.");
    }
}