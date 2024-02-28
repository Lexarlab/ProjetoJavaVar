package exercicios_repeticao;

import java.util.Scanner;

public class Exercicio1DoWhile {

	public static void main(String[] args) {
		int number, total = 0;
		
		Scanner read = new Scanner (System.in);
	
		do {
			System.out.println("Digite um número: ");
			number = read.nextInt();
			
			if (number > 0) {
				total += number;
			}
			
		} while ( number != 0);
			System.out.print("A soma dos números positivos é: " + total);
		
			read.close();
	}

}
