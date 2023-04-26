package br.com.beatriz.intermediario;

import java.io.IOException;
import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe o valor de A: ");
		double A = Double.parseDouble(leitor.next());
		System.out.println("Informe o valor de B: ");
		double B = Double.parseDouble(leitor.next());
		System.out.println("Informe o valor de C: ");
		double C = Double.parseDouble(leitor.next());
		double maior;
		double soma;
		boolean triangulo = false;
		double area;
		double perimetro;
		
		//TODO: Implemente a condição necessária para o cálculo do triângulo:
		//Dica: Você pode utilizar o String.format() na formatação do texto.
		if ((A > B) & (A > C)) {
			if (((B + C) > A) & ((B - C) < A)) {
				maior = A;
				triangulo = true;
				perimetro = A + B + C;
				System.out.println("Perimetro = " + perimetro);
			} else {
				area = ((A + B) * C) / 2; 
				System.out.println("Area = " + area);
			}
		} else if ((B > A) & (B > C)) {
			if (((A + C) > B) & ((A - C) < B)) {
				maior = B;
				triangulo = true;
				perimetro = A + B + C;
				System.out.println("Perimetro = " + perimetro);
			} else {
				area = ((A + B) * C) / 2; 
				System.out.println("Area = " + area);
			}
		} else if ((C > A) & (C > B)) {
			if (((A + B) > C) & ((A - B) < C)) {
				maior = C;
				triangulo = true;
				perimetro = A + B + C;
				System.out.println("Perimetro = " + perimetro);
			} else {
				area = ((A + C) * B) / 2; 
				System.out.println("Area = " + area);
			}
		}
		if (triangulo) {
			System.out.println("Triângulo válido");
		} else {
			System.out.println("Valores inválidos para um triângulo");
		}
	}
}
