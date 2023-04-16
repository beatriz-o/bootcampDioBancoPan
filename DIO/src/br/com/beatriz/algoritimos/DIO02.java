package br.com.beatriz.algoritimos;

import java.util.Scanner;

public class DIO02 {

	public static void main(String[] Args) {

	     double h = 0;
	     Scanner sc = new Scanner(System.in);
	     double n = sc.nextDouble();

	     for (double i = 1; i <= n; i++) {
	    	 h += (1/i);  

	      }
	     //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:
	      System.out.print(String.format("%.0f", h)); 
	   }
}
