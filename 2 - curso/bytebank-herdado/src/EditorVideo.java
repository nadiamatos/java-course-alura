
public class EditorVideo extends Funcionario {

	public double getBonificacao() {
		System.out.println("Chamando metodo de bonificacao do editor");
		return super.getBonificacaco() + 100;
	}
	
}
