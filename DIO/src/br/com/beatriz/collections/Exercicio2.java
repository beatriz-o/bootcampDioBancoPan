package br.com.beatriz.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		//Faça 5 perguntas para uma pessoa sobre um crime: 
		Scanner input = new Scanner(System.in);
		int resposta;
		
		List<String> perguntas = new ArrayList<String>();
		perguntas.add("Telefonou para a vítima? ");
		perguntas.add("Esteve no local do crime? ");
		perguntas.add("Mora perto da vítima? ");
		perguntas.add("Devia para a vítima? ");
		perguntas.add("Já trabalhou com a vítima? ");
		
		int sim = 0;
		
		Iterator<String> iterator = perguntas.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			System.out.println(next);
			System.out.println("[1] Sim");
			System.out.println("[2] Não");
			resposta = Integer.parseInt(input.nextLine());
			if (resposta == 1) {
				sim ++;
			} else {
				System.out.println("Resposta inválida");
			}
		}
		if (sim == 2) {
			System.out.println("Suspeito");
		} else if ((sim == 3) || (sim == 4)) {
			System.out.println("Cúmplice");
		} else if (sim == 5) {
			System.out.println("Assasino");
		} else {
			System.out.println("Inocente");
		}
		input.close();
	}
}
