/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quest_360;

/**
 *
 * @author vinic
 */
import java.util.Scanner;
public class Quest_360 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dataNascimento;

        
        String[] signos = {"Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem", "Libra", "Escorpião", "Sagitário", "Capricórnio", "Aquário", "Peixes"}; 

        int[] inicioSignos = {21, 20, 21, 21, 22, 22, 23, 23, 22, 22, 20, 20};

       
        do {
            System.out.print("Digite a data de nascimento (dd/mm) ou 9999 para sair: ");
            dataNascimento = scanner.nextInt();

            if (dataNascimento != 9999) {
                int mes = dataNascimento / 100;
                int dia = dataNascimento % 100;

              
                int indice = 0;
                while (indice < 12 && dia < inicioSignos[indice] || (indice == 11 && dia > inicioSignos[11])) {
                    indice++;
                }

                System.out.println("Seu signo é: " + signos[indice]);
                
            }
        } while (dataNascimento != 9999);

        scanner.close();
    }
}
