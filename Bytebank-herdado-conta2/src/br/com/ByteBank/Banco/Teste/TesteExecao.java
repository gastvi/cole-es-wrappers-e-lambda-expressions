package br.com.ByteBank.Banco.Teste;

import br.com.ByteBank.Banco.Modelo.*;

public class TesteExecao {

	public static void main(String[] args) {

		ContaCorrente c = new ContaCorrente(123, 120);
		c.depositar(100);
		try {
		c.saca(99.8);
		}catch (ExcecaoDeSaldoInsuficiente e) {
			System.out.println(e.getMessage());
		}
			
	}

}
