package exercicios_repeticao;

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) { 
		int age;
		int ageless21 = 0;
		int agegreater50 = 0;
		
		Scanner read = new Scanner(System.in);
		
		while (true) {	
			System.out.println("Digite a idade: ");
			age = read.nextInt();
			if (age < 0) {
				break;
			}
			else if (age < 21) {	
				ageless21++;
			} 
			else if (age > 50) {
				agegreater50++;
			}
		}
		
		System.out.print("Total de idades menor que 21 anos: " + ageless21);
		System.out.print("\nTotal de idades maior que 50 anos: " + agegreater50);
		
		read.close();
	}

}
