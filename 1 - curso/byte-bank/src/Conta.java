
public class Conta {

	// atributos - inicialmente com valor default
	double saldo;
	int agencia = 42;
	int numero;
	String titular;
	
	public void deposita(double saldo) {		
		this.saldo += saldo;		
	}
	
	public boolean saca(double valor) {
		
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;		
	}
	
	public boolean transfere(double valor, Conta destino) {
		
		boolean saldoSuficiente = this.saca(valor);
		
		if (saldoSuficiente) {
			destino.deposita(valor);
			return true;
		}
		return false;
	}
}
