public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		metodo1();
		System.out.println("Fim do main");
	}

	public static void metodo1() {
		System.out.println("Ini do metodo1");
		try {
			metodo2();
		} catch (ArithmeticException ex) {
			System.out.println("Divisao por zero");
		}

		System.out.println("Fim do metodo1");
	}

	public static void metodo2() {
		System.out.println("Ini do metodo2");
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
			int a = i / 0;
		}
		System.out.println("Fim do metodo2");
	}

}
