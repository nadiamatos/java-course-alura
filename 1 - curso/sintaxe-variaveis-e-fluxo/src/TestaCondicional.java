
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("testando condicionais");

		int idade = 20;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("voce tem mais de 18 anos");
			System.out.println("seja bem vindo");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("voce nao tem 18, mas pode entrar, " + "pois est� acompanhado");
			} else {			
				System.out.println("nada");
			}
			System.out.println("voce nao pode");
		}

	}

}
