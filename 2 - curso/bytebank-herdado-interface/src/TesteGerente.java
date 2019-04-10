
public class TesteGerente {

	public static void main(String[] args) {

		Autenticavel g1 = new Gerente();
		
		Gerente g = new Gerente();
		g.setNome("Nico");
		g.setCpf("28789829-99");
		g.setSalario(1000);
		
		System.out.println(g.getNome());
		System.out.println(g.getCpf());
		System.out.println(g.getSalario());
		
		g.setSenha(12);
		boolean resultado = g.autentica(12);
		
		System.out.println(resultado);		
		System.out.println(g.getBonificacaco());
		
	}

}
