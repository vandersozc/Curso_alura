package br.com.betha.banco;

import br.com.betha.banco.conta.ContaCorrente;
import br.com.betha.banco.conta.Tributavel;

public class TestaTributavel {
	
	public static void main(String [] args) {
		
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.calculaTributos());
		
		Tributavel t = cc;
		System.out.println(t.calculaTributos());
		
	    
	}

}
