package br.com.beatriz.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercicio1 {
	public static void main(String[] args) {
		//Crie uma lista que receba a temperatura média dos 6 primeiros meses do ano
		List<Double> temperatura = new ArrayList<Double>();
		temperatura.add(20.5);
		temperatura.add(21d);
		temperatura.add(21.7);
		temperatura.add(21.8);
		temperatura.add(21.2);
		temperatura.add(20.9);
		System.out.println(temperatura);
		//Calcule a média semestral das temperaturas
		Iterator<Double> iterator = temperatura.iterator();
		Double soma = 0d;
		while (iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		Double media = soma / temperatura.size();
		System.out.println(String.format("A média da temperatura nos 6 primeiros meses é: " + "%.1f" , (media)));
		
		//Mostre todas as temperaturas acima dessa média e o mês em que elas ocorreram
		Iterator<Double> it2 = temperatura.iterator();
		while (it2.hasNext()) {
			Double next = it2.next();
			String mes = null;
			if (temperatura.indexOf(next) == 0) {
				mes = "Janeiro";
			}
			if (temperatura.indexOf(next) == 1) {
				mes = "Fevereiro";
			}
			if (temperatura.indexOf(next) == 2) {
				mes = "Março";
			}
			if (temperatura.indexOf(next) == 3) {
				mes = "Abril";
			}
			if (temperatura.indexOf(next) == 4) {
				mes = "Maio";
			}
			if (temperatura.indexOf(next) == 5) {
				mes = "Junho";
			}
			if (next > media) {
				System.out.println("Temperatura: " + next + " Mês: " + mes);
			}
		}
	}
}