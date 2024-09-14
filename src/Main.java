import Lista_Dupla.Editor.EditorTexto;
import Lista_Dupla.JogoCarta.MaoDeCartas;
import Lista_Simples.gerenciadorTarefas.GerenciadorTarefas;
import Lista_Simples.historico.HistoricoNavegacao;
import Lista_Simples.sistema_de_controle.ControleReversao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Gerenciador de Tarefas");
            System.out.println("2. Histórico de Navegação");
            System.out.println("3. Sistema de Reversão (Undo)");
            System.out.println("4. Editor de Texto");
            System.out.println("5. Jogo de Cartas");
            System.out.println("6. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            if (opcao == 6) {
                break;
            }

            switch (opcao) {
                case 1:
                    gerenciadorDeTarefas(scanner);
                    break;
                case 2:
                    historicoDeNavegacao(scanner);
                    break;
                case 3:
                    sistemaDeUndo(scanner);
                    break;
                case 4:
                    editorDeTexto(scanner);
                    break;
                case 5:
                    jogoDeCartas(scanner);
                    break;

                    default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }

    // Método para o Gerenciador de Tarefas
    public static void gerenciadorDeTarefas(Scanner scanner) {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();

        while (true) {
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Remover tarefa");
            System.out.println("3. Marcar tarefa como concluída");
            System.out.println("4. Exibir tarefas");
            System.out.println("5. Voltar ao menu principal");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 5) break;

            switch (opcao) {
                case 1:
                    System.out.println("Descrição da tarefa:");
                    String descricao = scanner.nextLine();
                    gerenciador.adicionarTarefa(descricao);
                    break;
                case 2:
                    System.out.println("Descrição da tarefa a remover:");
                    String descRemover = scanner.nextLine();
                    gerenciador.removerTarefa(descRemover);
                    break;
                case 3:
                    System.out.println("Descrição da tarefa a marcar como concluída:");
                    String descConcluida = scanner.nextLine();
                    gerenciador.marcarConcluida(descConcluida);
                    break;
                case 4:
                    gerenciador.exibirTarefas();
                    break;
            }
        }
    }

    // Método para o Histórico de Navegação
    public static void historicoDeNavegacao(Scanner scanner) {
        HistoricoNavegacao historico = new HistoricoNavegacao(3);

        while (true) {
            System.out.println("1. Adicionar URL");
            System.out.println("2. Exibir histórico");
            System.out.println("3. Voltar ao menu principal");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 3) break;

            switch (opcao) {
                case 1:
                    System.out.println("Digite a URL:");
                    String url = scanner.nextLine();
                    historico.adicionarURL(url);
                    break;
                case 2:
                    historico.exibirHistorico();
                    break;
            }
        }
    }

    // Método para o Sistema de Undo
    public static void sistemaDeUndo(Scanner scanner) {
        ControleReversao controle = new ControleReversao();

        while (true) {
            System.out.println("1. Realizar ação");
            System.out.println("2. Desfazer última ação");
            System.out.println("3. Exibir ações realizadas");
            System.out.println("4. Voltar ao menu principal");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 4) break;

            switch (opcao) {
                case 1:
                    System.out.println("Descrição da ação:");
                    String descricao = scanner.nextLine();
                    controle.realizarAcao(descricao);
                    break;
                case 2:
                    controle.desfazerAcao();
                    break;
                case 3:
                    controle.exibirAcoes();
                    break;
            }
        }
    }
    public static void editorDeTexto(Scanner scanner) {
        EditorTexto editor = new EditorTexto();

        while (true) {
            System.out.println("1. Escrever texto");
            System.out.println("2. Desfazer");
            System.out.println("3. Refazer");
            System.out.println("4. Exibir texto");
            System.out.println("5. Voltar ao menu principal");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 5) break;

            switch (opcao) {
                case 1:
                    System.out.println("Digite o texto:");
                    String texto = scanner.nextLine();
                    editor.adicionarTexto(texto);
                    break;
                case 2:
                    editor.desfazer();
                    break;
                case 3:
                    editor.refazer();
                    break;
                case 4:
                    editor.exibirTexto();
                    break;
            }
        }
    }

    // Método para o Jogo de Cartas
    public static void jogoDeCartas(Scanner scanner) {
        MaoDeCartas jogo = new MaoDeCartas();

        while (true) {
            System.out.println("1. Adicionar carta");
            System.out.println("2. Remover carta");
            System.out.println("3. Reorganizar carta");
            System.out.println("4. Exibir mão");
            System.out.println("5. Voltar ao menu principal");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 5) break;

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome da carta:");
                    String carta = scanner.nextLine();
                    jogo.adicionarCarta(carta);
                    break;
                case 2:
                    System.out.println("Digite o nome da carta a remover:");
                    String cartaRemover = scanner.nextLine();
                    jogo.removerCarta(cartaRemover);
                    break;
                case 3:
                    System.out.println("Digite o nome da carta a reorganizar:");
                    String cartaReorganizar = scanner.nextLine();
                    jogo.reorganizarCarta(cartaReorganizar);
                    break;
                case 4:
                    jogo.exibirMao();
                    break;
            }
        }
    }
}