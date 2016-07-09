package br.com.betha.banco.conta;

public class ValorInvalidoException extends RuntimeException {
	
	private final double valor;

	public ValorInvalidoException(double valor) {
		super("Valor Inv�lido!");
		this.valor = valor;
	}

}
