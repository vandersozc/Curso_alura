package br.com.betha.banco;

import br.com.betha.banco.conta.Conta;
import br.com.betha.banco.conta.ContaCorrente;
import br.com.betha.banco.conta.ValorInvalidoException;

public class TestaDeposita {
	
	public static void main(String[] args){
		Conta cc = new ContaCorrente();
		
		try {
			cc.deposita(-100);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
	}
}