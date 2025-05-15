package Login;

import Aluno.Aluno;
import GerenciadorAlunos.GerenciadorAlunos;
import Login.Login;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Login login = new Login();

        System.out.println("===== Sistema de Gerenciamento =====");

        boolean autenticado = false;
        while (!autenticado) {
            System.out.print("Usuário: ");
            String usuario = scanner.nextLine();

            System.out.print("Senha: ");
            String senha = scanner.nextLine();

            if (login.autenticar(usuario, senha)) {
                System.out.println("Login bem-sucedido!\n");
                autenticado = true;
            } else {
                System.out.println("Usuário ou senha inválidos. Tente novamente.\n");
            }
        }

        // Após login, inicia o sistema
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();
        int opcao;

        do {
            System.out.println("\n---- Menu ----");
            System.out.println("1. Adicionar aluno");
            System.out.println("2. Listar alunos");
            System.out.println("3. Buscar aluno");
            System.out.println("4. Remover aluno");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Faltas: ");
                    int faltas = scanner.nextInt();
                    System.out.print("Nota: ");
                    double nota = scanner.nextDouble();
                    gerenciador.adicionarAluno(nome, faltas, nota);
                    System.out.println("Aluno adicionado com sucesso.");
                    break;

                case 2:
                    System.out.println("\n--- Lista de Alunos ---");
                    for (Aluno aluno : gerenciador.listarAlunos()) {
                        System.out.println(aluno);
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do aluno: ");
                    String busca = scanner.nextLine();
                    Aluno encontrado = gerenciador.buscarAluno(busca);
                    if (encontrado != null) {
                        System.out.println(encontrado);
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o nome do aluno a remover: ");
                    String remover = scanner.nextLine();
                    if (gerenciador.removerAluno(remover)) {
                        System.out.println("Aluno removido.");
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}
