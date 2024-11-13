/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quest_351;

/**
 *
 * @author vinic
 */
import java.util.Scanner;
public class Quest_351 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        String[] nomes = new String[5];

    
        System.out.println("Digite 5 nomes:");
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = scanner.nextLine();
        }

       
        System.out.print("Digite o número do nome (1 a 5): ");
        int indice = scanner.nextInt();

      
        if (indice >= 1 && indice <= nomes.length) {
            System.out.println("O nome é: " + nomes[indice - 1]);
        } else {
            System.out.println("Índice inválido.");
        }

        scanner.close();
    }
}
