package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {

		String nome = "Alura"; // object literal

		System.out.println(nome.contains("lu"));
		
		System.out.println(nome.indexOf("ur"));
		System.out.println(nome.charAt(0));
		System.out.println(nome.charAt(4));
		System.out.println(nome.length());
		System.out.println(nome.substring(1));

		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}

		System.out.println(nome.isEmpty());
		System.out.println(nome.isBlank());
		
		String vazio = " ";
		System.out.println(vazio.isEmpty());
		System.out.println(vazio.trim().isEmpty());
		
		String teste = "  N adia";		
		System.out.println(teste.trim());
		
//		char a = 'A';
//		char c = 'a';

//		String outro = nome.replace(a, c);		
//		nome.toLowerCase();

		System.out.println(nome);
//		System.out.println(outro);
		System.out.println(nome.toUpperCase());
		System.out.println(nome);
		
		StringBuilder builder = new StringBuilder("Socorram");
		builder.append("-");
		builder.append("me");
		builder.append(", ");
		builder.append("subi ");
		builder.append("no ");
		builder.append("ônibus ");
		builder.append("em ");
		builder.append("Marrocos ");
		
		String texto = builder.toString();
		System.out.println(texto);
			
	}

}
