package br.com.beatriz.intermediario;

import java.util.Scanner;

public class EspacosVogais {
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Digite uma frase: ");
	     String str = sc.nextLine().toLowerCase();
	     String[] strSplit = str.split(" ");
	     char[] arrVogais = {'a', 'e', 'i', 'o', 'u'};
	     int espacosEmBranco = strSplit.length - 1, quantVogais = 0;
	     
	  //TODO: Implemente condições (laços) adequados para que possamos contar os espaços em brancos e as vogais que existem na string.
	  //Dica: Você pode utilizar o Character.toLowerCase em sua condição:
	     
	    for (String item : strSplit) {
	    	var letras = item.toCharArray();
	    	for (char x : letras) {
	    		for (int i = 0; i < 5; i++) {
	    			if (arrVogais[i] == x) {
	    				quantVogais ++;
	    			}
	    		}
	    	}
	    }
	    System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
	    sc.close();
	}
}
