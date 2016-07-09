package br.com.betha.banco;

import br.com.betha.banco.conta.Conta;
import br.com.betha.banco.conta.ContaCorrente;
import br.com.betha.banco.conta.ContaPoupanca;

public class TestaConta {

	public static void main(String[] args) {
		
		Conta[] conta = new Conta[10];
		
		Conta contaCorrente = new ContaCorrente();
		Conta contaPupanca = new ContaPoupanca(0, null);
		
		Conta conta2  = new ContaCorrente();
		conta2.setSaldo(500);
		System.out.println(conta2);

	}

}
