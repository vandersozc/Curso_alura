package br.com.betha.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.betha.banco.conta.ContaPoupanca;

public class TestaOrdenacao {
	
	public static void main(String[] args) {
		List<ContaPoupanca> contas = new ArrayList<ContaPoupanca>();
		
		ContaPoupanca c1 = new ContaPoupanca(1, "Maria");
		c1.deposita(500);
		contas.add(c1);

		ContaPoupanca c2 = new ContaPoupanca(2, "Andre");
		c2.deposita(100);
		contas.add(c2);
		
		ContaPoupanca c3 = new ContaPoupanca(3, "Pedro");
		c3.deposita(300);
		contas.add(c3);
		
		Collections.sort(contas);
		
        for (ContaPoupanca conta : contas) {
            System.out.println(conta);
        }
	}
}

