
public class TesteReferencias {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		Conta segundaConta = primeiraConta;
		primeiraConta.saldo = 300;
		
		System.out.println(primeiraConta.saldo);
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
		segundaConta.saldo = 600;
		
		System.out.println(primeiraConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("são iguais");
		}
	}
	
}
