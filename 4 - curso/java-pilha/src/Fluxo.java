import java.rmi.AccessException;

public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (Exception ex) {
			String msg = ex.getMessage();
			ex.printStackTrace();
		}
		System.out.println("Fim do main");
	}

	public static void metodo1() {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	public static void metodo2() {
		System.out.println("Ini do metodo2");
//		throw new MinhaException("Minha exceção");		
//		throw new ArithmeticException("algo errado");
	}

}
