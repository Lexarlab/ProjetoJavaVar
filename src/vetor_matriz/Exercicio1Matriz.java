package vetor_matriz;

import java.util.Scanner;

public class Exercicio1Matriz {

	public static void main(String[] args) {
		
		int [][] matrix = new int[3][3];
		int sumDP = 0, sumDS = 0;
		
		Scanner read = new Scanner(System.in);
		int line, coloumn, index;
		
		for (line = 0; line < 3; line++) {
			for(coloumn = 0; coloumn < 3; coloumn++) {
				System.out.println("Digite um valor para [" + line + "] [" + coloumn + "]: ");
				matrix[line][coloumn] = read.nextInt();
			}
		}
		System.out.println("Elementos da diagonal: ");
		
		for (index = 0; index < 3; index++) {
			System.out.print(matrix[index][index] + " ");
		}
		System.out.println("\nElementos da diagonal secundária: ");
		for (index = 0; index < 3; index++) {
			System.out.print(matrix[index][2-index] + " ");
		}
		System.out.println("\nSoma dos elemenos da diagonal: ");
		for (index = 0; index < 3; index++) {
			sumDP += matrix[index][index];
		}
		System.out.println(sumDP);
		
		System.out.println("Soma da diagonal secundária: ");
		for (index = 0; index < 3; index++) {
			sumDS += matrix[index][2-index];
		}
		System.out.println(sumDS);
		
	}

}
