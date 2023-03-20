package br.com.ByteBank.Banco.Teste.Util;

import java.util.ArrayList;

import br.com.ByteBank.Banco.Modelo.Conta;
import br.com.ByteBank.Banco.Modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		    ArrayList<Conta> lista = new ArrayList<Conta>();

		    Conta cc1 = new ContaCorrente(22, 11);
		    Conta cc2 = new ContaCorrente(22, 22);

		    lista.add(cc1);

		    boolean existe = lista.contains(cc2); //novo

		    System.out.println("Já existe? " + existe);
		    
		    boolean igual = cc1.equals(cc2);
		    System.out.println(igual);

		    for(Conta conta : lista){
		        System.out.println(conta);
		    }
		}
}
