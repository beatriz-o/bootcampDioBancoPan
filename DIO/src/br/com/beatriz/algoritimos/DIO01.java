package br.com.beatriz.algoritimos;

import java.io.IOException;
import java.util.Scanner;

public class DIO01 {

	public static void main(String[] args) throws IOException {
	     Scanner leitor = new Scanner(System.in);
	     int cont = 0;
	     double media = 0;
	     double x = 0;

	     //TODO: Implemente as condições adequadas para obter a quantidade 
	    //de valores positivos e a média dos valores positivos:
	        for (int i = 0; i < 6; i ++) {
	        	double valor = leitor.nextDouble();
		        	if (valor >= 0){
		        	  cont += 1;
		        	  x += valor;
		        	}
	        	}
	        
	        
	        media = x / 6;
	        System.out.println(cont + " valores positivos");
	        System.out.println(String.format("%.1f", media));
	    }
}
