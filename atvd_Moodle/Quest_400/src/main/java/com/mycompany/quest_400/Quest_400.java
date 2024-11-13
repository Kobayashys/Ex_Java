/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quest_400;

/**
 *
 * @author vinic
 */
import java.util.Scanner;
public class Quest_400 {
class Quarto {
    int numeroLeitos;
    double preco;
    String situacao;
    String dataEntrada;
    String dataSaida;
    int diarias;
    double despesasExtras;
    double valorAPagar;
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Quarto[] quartos = new Quarto[50];

        // ... (inicialização dos quartos, se necessário)

        int opcao;
        do {
            System.out.println("Hotel-Fazenda Sucesso");
            System.out.println("1. Cadastra quartos");
            System.out.println("2. Lista todos os quartos");
            System.out.println("3. Lista quartos ocupados");
            System.out.println("4. Aluguel/reserva quarto");
            System.out.println("5. Entra despesas extras");
            System.out.println("6. Calcula despesa do quarto");
            System.out.println("7. Sai");
            System.out.print("Opção:   ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Cadastrar quartos
                    break;
                case 2:
                    // Listar todos os quartos
                    break;
                case 3:
                    // Listar quartos ocupados
                    break;
                case 4:
                    // Aluguel/reserva quarto
                    break;
                case 5:
                    // Entra despesas extras
                    break;
                case 6:
                    // Calcula despesa do quarto
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 7);
    }

    // ... (implementação dos métodos para cada opção do menu)
}
    

