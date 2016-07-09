package br.com.betha.banco.conta;

public class ContaCorrente extends Conta implements Tributavel{

	@Override
	public void atualiza(double taxa) {
		atualiza(taxa * 2);
		
	}

	@Override
	public double calculaTributos() {
		return  this.getSaldo() * 0.01;
	}

}
