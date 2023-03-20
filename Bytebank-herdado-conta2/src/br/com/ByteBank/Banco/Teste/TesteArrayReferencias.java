package br.com.ByteBank.Banco.Teste;

import br.com.ByteBank.Banco.Modelo.Conta;
import br.com.ByteBank.Banco.Modelo.ContaCorrente;
import br.com.ByteBank.Banco.Modelo.ContaPoupanca;

public class TesteArrayReferencias {
	
	public static void main(String[] args) {
		
//		ContaCorrente[] contas = new ContaCorrente[5];
//
//        ContaCorrente cc1 = new ContaCorrente(22, 11);
//        ContaCorrente cc2 = new ContaCorrente(22, 22);
//
//        contas[0] = cc1;
//        contas[1] = cc2;
//        
//        System.out.println(contas[0].getNumero());
        
        Conta[] contas = new Conta[5];
        ContaCorrente cc1 = new ContaCorrente(22, 11);
        contas[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(22, 22);
        contas[1] = cc2;    

        System.out.println(contas[1].getNumero()  );

        ContaCorrente ref = (ContaCorrente) contas[0];
        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());
	}

}
