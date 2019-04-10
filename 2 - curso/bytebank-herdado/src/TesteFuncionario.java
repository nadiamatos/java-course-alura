
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario nico = new Funcionario();
		
		nico.setNome("Nico Steppot");
		nico.setCpf("228478947984");
		nico.setSalario(2500);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacaco());
		
		// nico.salario = 300.00;
	}
	
}
