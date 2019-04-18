package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestaSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(33, 0000);
		
		conta.deposita(200.0);
		conta.saca(500.0);
		
		System.out.println(conta.getSaldo());
	}

}
