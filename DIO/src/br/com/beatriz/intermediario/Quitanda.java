package br.com.beatriz.intermediario;

import java.util.Scanner;

public class Quitanda {
	public static void main(String[] args) {
	    
       Scanner input = new Scanner(System.in);
       System.out.println("Quantos kg de morango? ");
       int morangos = input.nextInt();
       System.out.println("Quantos kg de maça? ");
       int macas = input.nextInt();
       
     //TODO: Implemente as condições necessárias para retornar o preço a ser pago pelo cliente, conforme a tabela de preços do seu Zé:
       
       float total = 0;
       
       if (morangos <= 5) {
    	   total += morangos * 2.5;
       } else {
    	   total += morangos * 2.2;
       }
       
       if (macas <= 5) {
    	   total += macas * 1.8;
       } else {
    	   total += macas * 1.5;
       }
       
       if ((total > 25) || (macas + morangos > 8)) {
    	   total = (float) (total * 0.9);
       }
       System.out.println(String.format("Valor a pagar: R$" + "%.2f", (total)));
       input.close();      
    }
}
