package vetor_matriz;

public class ExemploMatriz {

	public static void main(String[] args) {
		
		int matrix[][] = {{10, 15, 35}, {70, 120, 140}, {50, 100, 150}};
		
		int line, column; 
		
		for(line = 0; line < 3; line++) {
			for (column = 0; column < 3; column++) {
				
				System.out.println("[" + line + "] [" + column + "] " + matrix[line][column]);
			}
		}
	}

}
