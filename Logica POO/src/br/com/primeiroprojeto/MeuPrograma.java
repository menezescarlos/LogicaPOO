package br.com.primeiroprojeto;

public class MeuPrograma {

	public static void main(String[] args) {
		System.out.println("Meu primeiro \n projeto");
		
		
		/**
		 * System.out.println("Meu segndo projeto");
		 */
		
		//System.out.println("Meu Terceiro projeto");
		
		/**
		 * VARIAVEIS (BYTE, SHORT, CHAR, INT, LONG, FLOAT, DOUBLE, STRING)
		 * CASTING
		 */
		
		byte a = 1;
		short b = 20;
		char c = 's';
		long d = 100;
		float e = 2.4f;
		double f = 2.5;
		int g = 20;
		String j = "Variáveis";
		
		System.out.println("Byte vale = " + a);
		System.out.println("Short vale = " + b);
		System.out.println("Char vale = " + c);
		System.out.println("long vale = " + d);
		System.out.println("Float vale = " + e);
		System.out.println("Double vale = " + f);
		System.out.println("Int vale = " + g);
		System.out.println("String vale = " + j);
		
		//Casting
		
		float numeroFloat = 2.67f;
		int numeroInteiro = (int) numeroFloat;
		
		System.out.println("Caso de Casting onde um numero declarado em uma "
				+ "variável float se tranfrorma em "
				+ "um número inteiro = " + numeroInteiro);
		
		
		
		/**
		 * ESTRUTURA DE REPETIÇÃO (FOR, WHILE E DO...WHILE)
		 */
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Numeros = " + i);
			System.out.println("Numeros = " + i);
			i++;
		}
		
		while (numeroFloat <= 5) {
			System.out.println("Meu loop está funcionando");
			break;
		}
		
		do {
			for (int i = 0; i < 5; i++) {
				System.out.print("Numeros = " + i);
				System.out.println("Numeros = " + i);
				i++;
			}
			numeroFloat++;
		} while (numeroFloat <= 5);

	}

}
