package exercicios_condicionais;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int n1;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		n1 = read.nextInt();
		
		if (n1 > 0) {
			System.out.print("O número " + n1 + " é positivo!");
		}
		else {
			System.out.print("O número " + n1 + " é negativo!");
		}
		read.close();
	}

}
