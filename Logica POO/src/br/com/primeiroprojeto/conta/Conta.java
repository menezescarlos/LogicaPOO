package br.com.primeiroprojeto.conta;

public class Conta {
	private String titular;
	private int numeroDaConta;
	private String agencia;
	private double saldo;
	private String dataDeAbertura;

	public void saca(double valor) {
		this.setSaldo(getSaldo() - valor);
	}

	public void deposita(double valor) {
		this.setSaldo(this.getSaldo() + valor);
	}

	public double calcuaRendimento() {
		this.setSaldo(this.getSaldo() + getSaldo() * 0.1);
		return getSaldo();
	}

	public String recuperaDadosParaImpressao() {
		String dados = "Saldo inicial " + this.getSaldo();
		dados += "\nSaldo após o saque " + this.getSaldo();
		dados += "\nSaldo após o deposito " + this.getSaldo();
		dados += "\nSaldo com rendimentos " + this.calcuaRendimento();
		dados += "\nSaldo Atual = " + this.getSaldo();
		dados += "\nData de Abertura = " + this.getDataDeAbertura();
		return dados;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getDataDeAbertura() {
		return dataDeAbertura;
	}

	public void setDataDeAbertura(String dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}
}
