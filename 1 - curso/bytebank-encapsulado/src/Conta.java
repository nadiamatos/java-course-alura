
public class Conta {

	// atributos - inicialmente com valor default
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;		
	private static int total;
	
	public Conta(int agencia, int numero) {		
		Conta.total++;
		System.out.println("O total de contas � " + Conta.total);
		this.setAgencia(agencia);
		this.setNumero(numero);		
	}
	
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
	
	public double getSaldo() {		
		return this.saldo;				
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("N�o pode valor menor ou igual a zero");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
		
	public void setAgencia(int agencia) {
		if (agencia < 0) {
			System.out.println("N�o pode valor menor ou igual a zero");
			return;
		}
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
		
	public static int getTotal() {
		return Conta.total;
	}
}
