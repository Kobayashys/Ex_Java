/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quest_358;

/**
 *
 * @author vinic
 */
import java.util.Scanner;
public class Quest_358 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lucroAbaixo10 = 0, lucroEntre10e20 = 0, lucroAcima20 = 0;

        for (int i = 0; i < 100; i++) {
            System.out.print("Digite o preço de compra da mercadoria " + (i+1) + ": ");
            double precoCompra = scanner.nextDouble();

            System.out.print("Digite o preço de venda da mercadoria " + (i+1) + ": ");
            double precoVenda = scanner.nextDouble();

            double lucro = ((precoVenda - precoCompra) / precoCompra) * 100;

            if (lucro < 10) {
                lucroAbaixo10++;
            } else if (lucro <= 20) {
                lucroEntre10e20++;
            } else {
                lucroAcima20++;
            }
        }

        System.out.println("Quantidade de mercadorias com lucro abaixo de 10%: " + lucroAbaixo10);
        System.out.println("Quantidade de mercadorias com lucro entre 10% e 20%: " + lucroEntre10e20);
        System.out.println("Quantidade de mercadoria com lucro acima de 20%: " + lucroAcima20);

        scanner.close();
    }
}
