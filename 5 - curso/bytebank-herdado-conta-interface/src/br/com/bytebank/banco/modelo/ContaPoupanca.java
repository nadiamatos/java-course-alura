package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta implements Tributavel {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ContaPoupanca, Numero: " + super.getNumero();
	}
}
