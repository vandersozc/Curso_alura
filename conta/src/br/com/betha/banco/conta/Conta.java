package br.com.betha.banco.conta;

public abstract class Conta {

	protected double saldo;
	protected int numero;
	private String nome;

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void deposita(double valor) {
		if (valor < 0) {
			throw new ValorInvalidoException(valor);
		} else {
			this.saldo += valor;
		}
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public abstract void atualiza(double taxa);
	
	@Override
	public String toString() {
		return "Esse objeto � uma conta com saldo R$" + this.saldo;
	}
	
	@Override
	public boolean equals(Object obj) {
		Conta outraConta = (Conta) obj; 
		return this.numero == outraConta.numero && this.nome == outraConta.nome;
	}
}