/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quest_362;

/**
 *
 * @author Aluno
 */
import java.util.Scanner;
public class Quest_362 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vet1 = new int[10];
        int[] vet2 = new int[20];
        int[] vetc = new int[10];
        int L = 0;

        System.out.println("\nEntrada de dados do vetor 1 (10 elementos):");
        for (int i = 0; i < 10; i++) {
            System.out.print("\nEntre com o " + (i + 1) + " elemento: ");
            vet1[i] = scanner.nextInt();
        }

        System.out.println("\nEntrada de dados do vetor 2 (20 elementos):");
        for (int i = 0; i < 20; i++) {
            System.out.print("\nEntre com o " + (i + 1) + " elemento: ");
            vet2[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            vetc[i] = Integer.MIN_VALUE;
        }

        for (int i = 0; i < 10; i++) {
            int c = 0;
            while (vet1[i] != vet2[c] && c < 19) {
                c++;
            }
            if (vet1[i] == vet2[c]) {
                int d = 0;
                while (vet1[i] != vetc[d] && d < L) {
                    d++;
                }
                if (d == L) {
                    vetc[d] = vet1[i];
                    L++;
                }
            }
        }

        if (L > 0) {
            System.out.println("\n\nElementos comuns:\n\n");
            for (int i = 0; i < L; i++) {
                System.out.println(vetc[i]);
            }
        } else {
            System.out.println("\n\nNão existem elementos comuns");
        }
    }
}