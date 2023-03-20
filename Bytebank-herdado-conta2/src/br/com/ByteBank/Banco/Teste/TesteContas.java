package br.com.ByteBank.Banco.Teste;

import br.com.ByteBank.Banco.Modelo.ContaCorrente;
import br.com.ByteBank.Banco.Modelo.ContaPoupanca;
//um atalho pra importar todas as classes que vc vai usar é:shift+ctrl+o
public class TesteContas {
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111,111);
		cc.depositar(100);

		ContaPoupanca cp = new ContaPoupanca(222,222);
		cp.depositar(200);

		cc.transferir(10.0, cp);
		
		System.out.println("o saldo atual da conta cc e:"+cc.getSaldo());
		System.out.println("o saldo atual da conta cp e:"+cp.getSaldo());
	}

}
