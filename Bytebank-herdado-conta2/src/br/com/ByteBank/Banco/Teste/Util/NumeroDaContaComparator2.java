package br.com.ByteBank.Banco.Teste.Util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.ByteBank.Banco.Modelo.Cliente;
import br.com.ByteBank.Banco.Modelo.Conta;
import br.com.ByteBank.Banco.Modelo.ContaCorrente;
import br.com.ByteBank.Banco.Modelo.ContaPoupanca;

public class NumeroDaContaComparator2 {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Nico");
		cc1.setTitular(clienteCC1);
		cc1.depositar(333.0);

		Conta cc2 = new ContaPoupanca(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Guilherme");
		cc2.setTitular(clienteCC2);
		cc2.depositar(444.0);

		Conta cc3 = new ContaCorrente(22, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Paulo");
		cc3.setTitular(clienteCC3);
		cc3.depositar(222.0);

		Conta cc4 = new ContaPoupanca(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Ana");
		cc4.setTitular(clienteCC4);
		cc4.depositar(111.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		System.out.println("---------");
		
		lista.sort((c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));

		lista.forEach((conta) -> System.out.println(conta + ", " + conta.getTitular().getNome()));

		System.out.println("---------");

		Comparator<Conta> comp = (Conta c1, Conta c2) -> {
			String nomeC1 = c1.getTitular().getNome();
			String nomeC2 = c2.getTitular().getNome();
			return nomeC1.compareTo(nomeC2);
		};

		lista.sort(comp);

		lista.forEach((conta) -> System.out.println(conta + ", " + conta.getTitular().getNome()));

		System.out.println("---------");

		Collections.sort(lista);

		lista.forEach((conta) -> System.out.println(conta + ", " + conta.getTitular().getNome() 
				+ ", saldo: " + conta.getSaldo()));

	}

}
