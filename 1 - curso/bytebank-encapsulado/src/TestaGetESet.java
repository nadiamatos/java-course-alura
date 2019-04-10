
public class TestaGetESet {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 2000);
				
		conta.setNumero(1337);		
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		
		conta.setTitular(paulo);
		paulo.setNome("Paulo Silveira");
		
		System.out.println(conta.getTitular().getNome().toString());
		
		conta.getTitular().setNome("Nadia");
		System.out.println(conta.getTitular().getNome().toString());
		
	}
	
}
