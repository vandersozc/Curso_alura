package br.com.betha.banco;

import br.com.betha.banco.conta.ContaCorrente;

public class TestaComparaConta {
	
	public static void main(String[] args) {
		
		ContaCorrente conta1 = new ContaCorrente();
		ContaCorrente conta2 = new ContaCorrente();
		
		conta1.setNumero(50);
		conta2.setNumero(50);
		
		if (conta1.equals(conta2)) {
			System.out.println("Contas iguais");
		} else {
			System.out.println("Contas diferentes");
		}
		
			
	}

}
