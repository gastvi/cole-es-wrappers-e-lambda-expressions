package br.com.ByteBank.Banco.Teste;

import br.com.ByteBank.Banco.Modelo.ContaCorrente;
import br.com.ByteBank.Banco.Modelo.ContaPoupanca;

public class TesteToString {
	
	public static void main(String[] args) {

		Object cc = new ContaCorrente(22, 33);
		Object cp = new ContaPoupanca(33, 22);

		System.out.println(cc);
		System.out.println(cp);
	}

}
