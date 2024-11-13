/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quest_370;

/**
 *
 * @author vinic
 */

import java.util.Scanner;
public class Quest_370 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de voos: ");
        int numVoos = scanner.nextInt();
        int[] capacidadeVoos = new int[numVoos];
        int[] assentosDisponiveis = new int[numVoos];

        for (int i = 0; i < numVoos; i++) {
            System.out.print("Digite a capacidade do voo " + (i+1) + ": ");
            capacidadeVoos[i] = scanner.nextInt();
            assentosDisponiveis[i] = capacidadeVoos[i];
        }

        System.out.print("Digite o número de pedidos de reserva: ");
        int numPedidos = scanner.nextInt();

        for (int i = 0; i < numPedidos; i++) {
            System.out.print("Digite o número da carteira de identidade do cliente " + (i+1) + ": ");
            int identidade = scanner.nextInt();

            System.out.print("Digite o número do voo desejado: ");
            int vooDesejado = scanner.nextInt() - 1;

            if (vooDesejado >= 0 && vooDesejado < numVoos) {
                if (assentosDisponiveis[vooDesejado] > 0) {
                    System.out.println("Reserva realizada com sucesso para o cliente " + identidade + " no voo " + (vooDesejado+1));
                    assentosDisponiveis[vooDesejado]--;
                } else {
                    System.out.println("Não há assentos disponíveis para o voo " + (vooDesejado+1));
                }
            } else {
                System.out.println("Voo inválido.");
            }
        }

        scanner.close();
    }
}
