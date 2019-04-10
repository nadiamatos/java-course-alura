
public class TesteReferencias {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();				
		g1.setNome("Marcos");
		g1.setSalario(5000.00);				
		
		Funcionario f = new Funcionario();		
		f.setSalario(2000.00);
		
		EditorVideo e = new EditorVideo();
		e.setSalario(2500.00);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f);
		controle.registra(e);
		
		System.out.println(controle.getSoma());
				
		
	}

}
