/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quest_346;

/**
 *
 * @author vinic
 */
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Quest_346 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase;
        int opcao;

        do {
            System.out.println("MENU");
            System.out.println("1 - Imprime o comprimento da frase");
            System.out.println("2 - Imprime os dois primeiros e os dois últimos caracteres da frase");
            System.out.println("3 - Imprime a frase espelhada");
            System.out.println("4 - Termina o algoritmo");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digitea frase: ") ;
                    frase = scanner.nextLine();
                    System.out.println("O comprimento da frase é: " + frase.length());
                    break;
                case 2:
                    System.out.print("Digite a frase: ");
                    frase = scanner.nextLine();
                    if (frase.length() >= 2) {
                        System.out.println("Os dois primeiros caracteres são: " + frase.substring(0, 2));
                        System.out.println("Os dois últimos caracteres são: " + frase.substring(frase.length() - 2)); 

                    } else {
                        System.out.println("A frase é muito curta.");
                    }
                    break;
                case 3:
                    System.out.print("Digite a frase: ");
                    frase = scanner.nextLine();
                    String fraseInvertida = "";
                    for (int i = frase.length() - 1; i >= 0; i--) {
                        fraseInvertida += frase.charAt(i);
                    }
                    System.out.println("A frase invertida é: " + fraseInvertida);
                    break;
                case 4:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);


        scanner.close();
    }
}
