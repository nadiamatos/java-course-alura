
public class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	
	public Funcionario() {
		
	}
	
	public double getBonificacaco() {
		System.out.println("Chamando metodo de bonificacao do funcionario");
		return this.salario*0.1;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}
	
	
}
