package exercicios_repeticao;

import java.util.Scanner;

public class Exercicio2For {

	public static void main(String[] args) {
		
		int number1;
		int number2;
		int couter;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Escreva um número: ");
		number1 = read.nextInt();
		
		System.out.println("Escreva outro número: ");
		number2 = read.nextInt();
		
		if (number1 < number2) {
			
			for (couter = number1; couter < number2; couter++) {
				
				if (couter%3 == 0 && couter%5 == 0) {
					
					System.out.println(couter + " é multiplo de 3 e 5");
				}
			}
		} else {
			
			System.out.println("Intervalo inválido!");
		}
		
		read.close();
	}

}
