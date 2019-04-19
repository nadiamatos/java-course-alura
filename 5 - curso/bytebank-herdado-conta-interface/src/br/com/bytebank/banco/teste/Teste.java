package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {
		System.out.println("x");
		System.out.println(3);
		System.out.println(false);

		ContaCorrente cc = new ContaCorrente(22, 33);
		ContaPoupanca cp = new ContaPoupanca(33, 22);
		Cliente c = new Cliente();
		
		System.out.println(cc);
		System.out.println(cp);
		
		println();
		println(3);
		println(false);
		println(cc);
		println(cp);
		println(c);
	}

	// sobrecarga
	static void println() {
	}

	static void println(int value) {
	}

	static void println(boolean value) {
	}
	
	static void println(Object o) {
		System.out.println(o);
	}
}
