package Fila.Processos;
import java.util.Scanner;
import Fila.Fila;

public class FilaProcessos {
    public static void main(String[] args) {
        Fila filaProcessos = new Fila();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar processo à fila");
            System.out.println("2. Executar próximo processo");
            System.out.println("3. Exibir processos na fila");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.println("Digite o identificador do processo:");
                    String processo = scanner.nextLine();
                    filaProcessos.insereFinal(processo.hashCode()); // Usando hashCode como identificador
                    break;
                case 2:
                    if (!filaProcessos.isEmpty()) {
                        filaProcessos.removerFila();
                        System.out.println("Processo executado.");
                    } else {
                        System.out.println("Nenhum processo na fila.");
                    }
                    break;
                case 3:
                    filaProcessos.imprimeFila();
                    break;
                case 4:
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
