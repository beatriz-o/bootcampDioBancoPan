package br.com.beatriz.intermediario;
import java.io.IOException;
import java.util.Scanner;

public class ImpostoDeRenda {
	public static void main(String[] args) throws IOException {
		  Scanner leitor = new Scanner(System.in);
		  System.out.println("Informe sua renda mensal: ");
		  double renda = Double.parseDouble(leitor.next());
		  double imposto = 0;
	 
	      //TODO: Agora utilizando estrutura condicional implemente em seu código as condições necessárias para o cálculo da taxa de imposto de renda:
		  if (renda <= 2000) {
			  System.out.println("Isento do pagamento de Imposto de Renda");
		  } else if ((renda > 2000) && (renda <= 3000)) {
			  imposto = ((renda - 2000) * 0.08);
			  System.out.println(String.format("Valor a pagar de Imposto de renda: R$ " + "%.2f", (imposto)));
		  } else if ((renda > 3000) && (renda <= 4500)) {
			  imposto = ((1000 * 0.08) + ((renda - 2000 - 1000) * 0.18));
			  System.out.println(String.format("Valor a pagar de Imposto de renda: R$ " + "%.2f", (imposto)));
		  } else if (renda > 4500) {
			  imposto = ((1000 * 0.08) + (1500 * 0.18) + ((renda - 2000 - 1000 - 1500) * 0.28));
			  System.out.println(String.format("Valor a pagar de Imposto de renda: R$ " + "%.2f", (imposto)));
		  }
		  
	}
}
