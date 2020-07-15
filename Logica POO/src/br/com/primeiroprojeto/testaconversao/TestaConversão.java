package br.com.primeiroprojeto.testaconversao;

public class TestaConversão {

	public static void main(String[] args) {
		double salario = 2750.35;
		int valor = (int) salario;
		
		System.out.println(valor);
		
		float salarioGerente = 5432.90f;
		System.out.println(salarioGerente);
		
		double x = 0.1;
		double y = 0.2;
		
		double total = (x + y);
		
		System.out.println(total);
	}

}
