/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quest_356;

/**
 *
 * @author vinic
 */
import java.util.Scanner;
public class Quest_356 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String[] nomes = new String[15];
        double[] notaPR1 = new double[15];
        double[] notaPR2 = new double[15];
        double[] media = new double[15];
        char[] situacao = new char[15];

        
        for (int i = 0; i < 15; i++) {
            System.out.println("Aluno " + (i + 1));
            System.out.print("Nome: ");
            nomes[i] = scanner.nextLine();
            System.out.print("Nota PR1: ");
            notaPR1[i] = scanner.nextDouble();
            System.out.print("Nota PR2: ");
            notaPR2[i] = scanner.nextDouble();
           
            media[i] = Math.round((notaPR1[i] + notaPR2[i]) / 2);
            situacao[i] = media[i] >= 7 ? 'A' : 'R';
        }

        
        System.out.println("\n\nBoletim dos Alunos:");
        System.out.printf("%-20s %-8s %-8s %-8s\n", "Nome", "PR1", "PR2", "Situação");
        for (int i = 0; i < 15; i++) {
            System.out.printf("%-20s %-8.1f %-8.1f %-8c\n", nomes[i], notaPR1[i], notaPR2[i], situacao[i]);
        }
    }

    private static void getchar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void getcharset() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
