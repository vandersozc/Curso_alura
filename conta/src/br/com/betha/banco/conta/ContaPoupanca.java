package br.com.betha.banco.conta;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{
	
	public ContaPoupanca(int i, String string) {
		super();
	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}

	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}

	@Override
	public int compareTo(ContaPoupanca outra) {
		return this.getNumero() - outra.getNumero();
	}	
}
