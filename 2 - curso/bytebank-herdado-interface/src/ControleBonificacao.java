public class ControleBonificacao {

	private double soma;
		
	public void registra(Funcionario f) {		
		double bonificacao = f.getBonificacaco();	
		this.soma += bonificacao;		
	}
	
	public double getSoma() {
		return soma;
	}
	
}

