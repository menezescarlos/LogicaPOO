package br.com.primeiroprojeto.testaconta;

import br.com.primeiroprojeto.conta.Conta;

public class TesaConta {

	public static void main(String[] args) {
		
		
		Conta contaCorrente = new Conta();
		contaCorrente.setTitular("Carlos");
		contaCorrente.setNumeroDaConta(123);
		contaCorrente.setAgencia("45678-9");
		contaCorrente.setSaldo(50.00);
		contaCorrente.setDataDeAbertura("04/06/2015");
		
		//metodos sacar, depositar e calcular rendimentos
		System.out.println("Saldo inicial " + contaCorrente.getSaldo());
		
		contaCorrente.saca(10);
		System.out.println("Saldo após o saque " + contaCorrente.getSaldo());
		
		contaCorrente.deposita(200);
		System.out.println("Saldo após o deposito " + contaCorrente.getSaldo());
		
		System.out.println("Saldo com rendimentos " + contaCorrente.calcuaRendimento());
		
		System.out.println("Saldo Atual = " + contaCorrente.getSaldo() + "\nData de Abertura = " + 
		contaCorrente.getDataDeAbertura() + ". ");
		
		System.out.println("=============================================================");
		
		System.out.println(contaCorrente.recuperaDadosParaImpressao());
		
	}

}
