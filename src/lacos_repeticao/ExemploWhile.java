package lacos_repeticao;

import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {

		String proceed = "s";
		int namber1, namber2, result;
		Scanner read = new Scanner(System.in);

		while (!proceed.equals("n")) {
			System.out.println("Digite primeiro valor: ");
			namber1 = read.nextInt();

			System.out.println("Digite segundo valor: ");
			namber2 = read.nextInt();

			result = namber1 + namber2;

			System.out.println("O resultado da soma é: " + result);

			System.out.println("\n++++++++++++++++MENU++++++++++++++++++");
			System.out.println("\nDeseja somar dois valores?");
			System.out.println("\nDigite s para sim OU digite n para não: ");
			proceed = read.next();
			System.out.println("++++++++++++++++++++++++++++++++++");
		}
		read.close();
	}

}
