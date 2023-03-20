package br.com.ByteBank.Banco.Teste;

import br.com.ByteBank.Banco.Modelo.*;

public class TesteTributavel {
	
	public static void main(String[] args) {
		
		ContaCorrente cc= new ContaCorrente(222, 333);
		cc.depositar(100);
		
		SeguroDeVida sv = new SeguroDeVida();
		
		CalculadorImposto ci = new CalculadorImposto();
		
		ci.registra(cc);
		ci.registra(sv);
		
		System.out.println(ci.getTotalImposto());
	}

}
