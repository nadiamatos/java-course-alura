
public class ProgramaComBreak {

	public static void main(String[] args) {
		
		for (int linha = 1; linha < 6; linha++) {
			for (int coluna = 1; coluna < 6; coluna++) {
				if (linha == coluna) {
					break;
				}
				System.out.print(coluna);
			}
			System.out.println();
		}
		
	}
	
}
