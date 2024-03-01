package vetor_matriz;

import java.util.Scanner;

public class Exercicio1Vetor {

	public static void main(String[] args) {
		
		int vector[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6}; 
		int number, index;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Qual número você deseja encontrar");
		number = read.nextInt();
		
		for (index = 0; index < vector.length; index++) {
			
			if (vector[index] == number) {
				
				System.out.println("O número " + number + " está na posição " + index);
				break;
				
			} else if (index == vector.length-1){
				
				System.out.println("O número não foi encontrado");
			}
			
		}

	}

}
