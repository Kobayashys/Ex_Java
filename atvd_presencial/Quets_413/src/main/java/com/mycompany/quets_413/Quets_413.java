/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quets_413;

/**
 *
 * @author vinic
 */
import java.util.Scanner;
public class Quets_413 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cria uma matriz 5x5
        int[][] matriz = new int[5][5];

        // Lê os valores da matriz
        System.out.println("Digite os elementos da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Calcula a soma dos quadrados dos números ímpares abaixo da DS
        double somaQuadradosImpares = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i > j && matriz[i][j] % 2 != 0) {
                    somaQuadradosImpares += Math.pow(matriz[i][j], 2);
                }
            }
        }

        // Calcula a raiz quadrada
        double raizQuadrada = Math.sqrt(somaQuadradosImpares);

        // Imprime a matriz e o resultado
        System.out.println("Matriz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Raiz quadrada da soma dos quadrados dos números ímpares abaixo da DS: " + raizQuadrada);
        
    }
}
