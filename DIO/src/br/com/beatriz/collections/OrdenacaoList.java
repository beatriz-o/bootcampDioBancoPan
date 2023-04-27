package br.com.beatriz.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoList {
	public static void main(String[] args) {
//	Crie uma lista com 3 gatos
		List<Gato> meusGatos = new ArrayList<>() {{
			add(new Gato("Jon", 18, "preto"));
			add(new Gato("Simba", 6, "branco"));
			add(new Gato("Jon", 12, "amarelo"));
		}};
		
		//Ordem de inserção
		System.out.println("Ordem de inserção");
		System.out.println(meusGatos); //List sempre exibe pela ordem de inserção
		
		//Ordem aleatória
		System.out.println("Ordem aleatória");
		Collections.shuffle(meusGatos);
		System.out.println(meusGatos);
		
		//Ordem natural (nome)
		System.out.println("Ordem natural (nome)");
		Collections.sort(meusGatos);
		System.out.println(meusGatos);
		
		System.out.println("Ordem idade");
		Collections.sort(meusGatos, new ComparatorIdade());
//		meusGatos.sort(new ComparatorIdade());
		System.out.println(meusGatos);
		
		System.out.println("Ordem cor");
		Collections.sort(meusGatos, new ComparatorCor());
//		meusGatos.sort(new ComparatorIdade());
		System.out.println(meusGatos);
		
		System.out.println("Ordem nome/cor/idade");
		Collections.sort(meusGatos, new ComparatorNomeCorIdade());
//		meusGatos.sort(new ComparatorIdade());
		System.out.println(meusGatos);
	}
}

class Gato implements Comparable<Gato>{
	private String nome;
	private Integer idade;
	private String cor;
	
	public Gato(String nome, int idade, String cor) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getCor() {
		return cor;
	}

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
	}

	@Override
	public int compareTo(Gato gato) {
		return this.getNome().compareToIgnoreCase(gato.getNome());
	}

}

class ComparatorIdade implements Comparator<Gato>{
	@Override
	public int compare(Gato g1, Gato g2) {
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
}

class ComparatorCor implements Comparator<Gato>{
	@Override
	public int compare(Gato g1, Gato g2) {
		return g1.getCor().compareToIgnoreCase(g2.getCor());
	}
}

class ComparatorNomeCorIdade implements Comparator<Gato>{
	@Override
	public int compare(Gato g1, Gato g2) {
		int nome = g1.getNome().compareToIgnoreCase(g1.getNome());
		if (nome != 0) {
			return nome;
		}
		int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
		if (cor != 0) {
			return cor;
		}
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
}