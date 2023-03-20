package br.com.ByteBank.Banco.Modelo;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void depositar(double valor) {
		super.saldo += valor;

	}

	@Override
	public String toString() {
		return "ContaPoupanca, " + super.toString();
	}

}