
public class TestaMetodos {

	public static void main(String[] args) {
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;		
		contaDoPaulo.deposita(50);		
		System.out.println(contaDoPaulo.saldo);
		
		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.saldo = 1000;
		boolean sucessoTransferencia = contaDaMarcela.
				transfere(3000, contaDoPaulo); 
		if (sucessoTransferencia) {
			System.out.println("Transfer�ncia com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}		
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoPaulo.saldo);
	}

}