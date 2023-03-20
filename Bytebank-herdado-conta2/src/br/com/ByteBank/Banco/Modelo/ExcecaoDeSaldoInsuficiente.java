package br.com.ByteBank.Banco.Modelo;

public class ExcecaoDeSaldoInsuficiente extends RuntimeException{
	
	public ExcecaoDeSaldoInsuficiente(String msg) {
		super(msg);
	}

}
