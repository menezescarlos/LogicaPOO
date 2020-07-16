package br.com.primeiroprojeto.testaconta;

import br.com.primeiroprojeto.conta.Conta;

public class TesaConta {

	public static void main(String[] args) {
		
		
		Conta contaCorrente = new Conta();
		contaCorrente.titular = "Carlos";
		contaCorrente.numeroDaConta = 123;
		contaCorrente.agencia = "45678-9";
		contaCorrente.saldo = 50.00;
		contaCorrente.dataDeAbertura = "04/06/2015";
		
		//metodos sacar, depositar e calcular rendimentos
		System.out.println("Saldo inicial " + contaCorrente.saldo);
		
		contaCorrente.saca(10);
		System.out.println("Saldo após o saque " + contaCorrente.saldo);
		
		contaCorrente.deposita(200);
		System.out.println("Saldo após o deposito " + contaCorrente.saldo);
		
		System.out.println("Saldo com rendimentos " + contaCorrente.calcuaRendimento());
		
		System.out.println("Saldo Atual = " + contaCorrente.saldo + "\nData de Abertura = " + 
		contaCorrente.dataDeAbertura + ". ");
		
		System.out.println("=============================================================");
		
		System.out.println(contaCorrente.recuperaDadosParaImpressao());
		
	}

}
