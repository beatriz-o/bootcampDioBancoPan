package br.com.beatriz.intermediario;

import java.io.IOException;
import java.util.Scanner;

public class Animais {

	public static void main(String[] args)  throws IOException {
		Scanner sc = new Scanner(System.in);
		
		String AN1,AN2,AN3;
		String animal = null;
		
		System.out.println("Escolha uma opção:");
		System.out.println("[1] Vertebrado");
		System.out.println("[2] Invertebrado");
		AN1 = sc.nextLine().toLowerCase();
		if (AN1.equals("1") || (AN1.equals("vertebrado"))) {
			System.out.println("Escolha uma opção:");
			System.out.println("[1] Ave");
			System.out.println("[2] Mamifero");
			AN2 = sc.nextLine().toLowerCase();
			if (AN2.equals("1") || (AN2.equals("ave"))) {
				System.out.println("Escolha uma opção:");
				System.out.println("[1] Carnivoro");
				System.out.println("[2] Onivoro");
				AN3 = sc.nextLine().toLowerCase();
				if (AN3.equals("1") || (AN3.equals("carnivoro"))) {
					animal = "Aguia";
				} else if (AN3.equals("2") || (AN3.equals("onivoro"))) {
					animal = "Pomba";
				}
			} else if (AN2.equals("2") || (AN2.equals("mamifero"))) {
				System.out.println("Escolha uma opção:");
				System.out.println("[1] Onivoro");
				System.out.println("[2] Herbivoro");
				AN3 = sc.nextLine().toLowerCase();
				if (AN3.equals("1") || (AN3.equals("onivoro"))) {
					animal = "Homem";
				} else if (AN3.equals("2") || (AN3.equals("herbivoro"))) {
					animal = "Vaca";
				}
			}
		} else if (AN1.equals("2") || (AN1.equals("invertebrado"))) {
			System.out.println("Escolha uma opção:");
			System.out.println("[1] Inseto");
			System.out.println("[2] Anelideo");
			AN2 = sc.nextLine().toLowerCase();
			if (AN2.equals("1") || (AN2.equals("inseto"))) {
				System.out.println("Escolha uma opção:");
				System.out.println("[1] Hematofago");
				System.out.println("[2] Herbivoro");
				AN3 = sc.nextLine().toLowerCase();
				if (AN3.equals("1") || (AN3.equals("hematofago"))) {
					animal = "Pulga";
				} else if (AN3.equals("2") || (AN3.equals("herbivoro"))) {
					animal = "Lagarta";
				}
			} else if (AN2.equals("2") || (AN2.equals("anelideo"))) {
				System.out.println("Escolha uma opção:");
				System.out.println("[1] Hematofago");
				System.out.println("[2] Onivoro");
				AN3 = sc.nextLine().toLowerCase();
				if (AN3.equals("1") || (AN3.equals("hematofago"))) {
					animal = "Sanguessuga";
				} else if (AN3.equals("2") || (AN3.equals("onivoro"))) {
					animal = "Minhoca";
				}
			}
		}
		System.out.println(animal);
	}
}
