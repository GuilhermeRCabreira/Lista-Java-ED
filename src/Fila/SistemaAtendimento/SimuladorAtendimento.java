package Fila.SistemaAtendimento;

import java.util.Scanner;
import Fila.Fila;

public class SimuladorAtendimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fila fila = new Fila();

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar cliente à fila");
            System.out.println("2. Atender próximo cliente");
            System.out.println("3. Exibir clientes na fila");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            if (opcao == 4) {
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.println("Digite o ID do cliente:");
                    int clienteId = scanner.nextInt();
                    scanner.nextLine();  // Consumir a nova linha
                    fila.insereFinal(clienteId);
                    System.out.println("Cliente adicionado à fila.");
                    break;
                case 2:
                    if (fila.getInicio() == null) {
                        System.out.println("Nenhum cliente na fila.");
                    } else {
                        fila.removerFila();
                        System.out.println("Cliente atendido.");
                    }
                    break;
                case 3:
                    fila.imprimeFila();
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
