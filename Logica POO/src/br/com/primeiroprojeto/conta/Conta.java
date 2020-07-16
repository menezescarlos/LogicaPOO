package br.com.primeiroprojeto.conta;

public class Conta {
	public String titular;
	public int numeroDaConta;
	public String agencia;
	public double saldo;
	public String dataDeAbertura;

	public void saca(double valor) {
		this.saldo = saldo - valor;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public double calcuaRendimento() {
		this.saldo += saldo * 0.1;
		return saldo;
	}
	
	public String recuperaDadosParaImpressao() {
		String dados = "Saldo inicial " + this.saldo;
		dados += "\nSaldo após o saque " + this.saldo;
		dados += "\nSaldo após o deposito " + this.saldo;
		dados += "\nSaldo com rendimentos " + this.calcuaRendimento();
		dados += "\nSaldo Atual = " + this.saldo;
		dados += "\nData de Abertura = " + this.dataDeAbertura;
		return dados;
	}
}
