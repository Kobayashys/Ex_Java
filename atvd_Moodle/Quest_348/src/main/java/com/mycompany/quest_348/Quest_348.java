/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quest_348;

/**
 *
 * @author vinic
 */
import java.util.Scanner;
public class Quest_348 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String[] nomes = new String[5];
        double[] nota1 = new double[5];
        double[] nota2 = new double[5];
        double[] media = new double[5];

        
        for (int i = 0; i < 5; i++) {
            System.out.println("Aluno " + (i + 1));
            System.out.print("Nome: ");
            nomes[i] = scanner.nextLine();
            System.out.print("Nota 1: ");
            nota1[i] = scanner.nextDouble();
            System.out.print("Nota 2: ");
            nota2[i] = scanner.nextDouble();

        
            media[i] = (nota1[i] + nota2[i]) / 2;
        }

        
        System.out.println("\n\nBoletim dos Alunos:");
        System.out.printf("%-20s %-8s %-8s %-8s\n", "Nome", "Nota 1", "Nota 2", "Média");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%-20s %-8.2f %-8.2f %-8.2f\n", nomes[i], nota1[i], nota2[i], media[i]);
        }
    }
}
