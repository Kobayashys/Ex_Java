/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quest_394;

/**
 *
 * @author vinic
 */
import java.util.Scanner;
import java.util.Arrays;
public class Quest_394 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int MAX_PRODUTOS = 50;
        int[] codigos = new int[MAX_PRODUTOS];
        int[] quantidades = new int[MAX_PRODUTOS];
        double[] precos = new double[MAX_PRODUTOS];

        int i = 0;
        while (i < MAX_PRODUTOS && codigos[i] != -1) {
            System.out.print("Digite o código do produto (" + (i+1) + "): ");
            codigos[i] = scanner.nextInt();
            if (codigos[i] != -1) {
                System.out.print("Digite a quantidade em estoque: ");
                quantidades[i] = scanner.nextInt();
                System.out.print("Digite o preço de venda: ");
                precos[i] = scanner.nextDouble();
                i++;
            }
        }

        double totalVendido = 0;
        int codigoProduto;
        int quantidadeVendida;

        System.out.println("\nInício das vendas:");
        do {
            System.out.print("Digite o código do produto a ser vendido (0 para sair): ");
            codigoProduto = scanner.nextInt();

            if (codigoProduto > 0) {
                int indice = buscaSequencial(codigos, i, codigoProduto);
                if (indice != -1) {
                    System.out.print("Digite a quantidade a ser vendida: ");
                    quantidadeVendida = scanner.nextInt();
                    if (quantidadeVendida <= quantidades[indice]) {
                        quantidades[indice] -= quantidadeVendida;
                        totalVendido += quantidadeVendida * precos[indice];
                        System.out.println("Venda realizada com sucesso!");
                    } else {
                        System.out.println("Estoque insuficiente.");
                    }
                } else {
                    System.out.println("Produto não cadastrado.");
                }
            }
        } while (codigoProduto != 0);

        ordenarPorQuantidade(codigos, quantidades, precos, i);

        System.out.println("\nRelatório Final:");
        System.out.println("Total vendido: R$" + totalVendido);
        System.out.println("Estoque atual:");
        for (int j = 0; j < i; j++) {
            System.out.println("Código: " + codigos[j] + ", Quantidade: " + quantidades[j] + ", Preço: R$" + precos[j]);
        }
    }

    
    public static int buscaSequencial(int[] vetor, int tamanho, int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public static void ordenarPorQuantidade(int[] codigos, int[] quantidades, double[] precos, int tamanho) {
    }
}
