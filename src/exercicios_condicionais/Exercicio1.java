package exercicios_condicionais;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int n1, n2, n3;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o número A: ");
		n1 = read.nextInt();
		System.out.println("Digite o número B: ");
		n2 = read.nextInt();
		System.out.println("Digite o número C: ");
		n3 = read.nextInt();
		
		if (n1 + n2 > n3) {
			System.out.print("A soma de " + n1 + " + " + n2 + " é maior que " + n3);
		}
		else if (n1 + n2 < n3) {
			System.out.print("A soma de " + n1 + " + " + n2 + " é menor que " + n3);
		}
		else {
			System.out.print("A soma de " + n1 + " + " + n2 + " é igual que " + n3);
		}
		read.close();
	}

}
