package br.com.betha.banco;

import br.com.betha.banco.conta.ContaCorrente;
import br.com.betha.banco.conta.GerenciadorDeImpostoDeRenda;
import br.com.betha.banco.conta.SeguroDeVida;

public class TestaGerenciadorDeImpostoDeRenda {
	
    public static void main(String[] args) {

        GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();

        SeguroDeVida sv = new SeguroDeVida();
        gerenciador.adiciona(sv);

        ContaCorrente cc = new ContaCorrente();
        cc.deposita(1000);
        gerenciador.adiciona(cc);

        System.out.print(gerenciador.getTotal());
    }

}
