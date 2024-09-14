package Fila.SistemaGerenciamento;

import java.util.Scanner;
import Fila.Fila;

public class GerenciamentoImpressao {public static void main(String[] args) {
    Fila filaImpressao = new Fila();
    Scanner scanner = new Scanner(System.in);

    while (true) {
        System.out.println("Escolha uma opção:");
        System.out.println("1. Adicionar trabalho de impressão");
        System.out.println("2. Processar próximo trabalho");
        System.out.println("3. Exibir trabalhos na fila");
        System.out.println("4. Sair");

        int opcao = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        switch (opcao) {
            case 1:
                System.out.println("Digite o nome do trabalho de impressão:");
                String trabalho = scanner.nextLine();
                filaImpressao.insereFinal(trabalho.hashCode()); // Usando hashCode como identificador
                break;
            case 2:
                if (!filaImpressao.isEmpty()) {
                    filaImpressao.removerFila();
                    System.out.println("Trabalho de impressão processado.");
                } else {
                    System.out.println("Nenhum trabalho na fila.");
                }
                break;
            case 3:
                filaImpressao.imprimeFila();
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
