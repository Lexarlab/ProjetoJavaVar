package lacos_repeticao;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {
		
		int number, result, couter = 0;
        Scanner read = new Scanner(System.in);

        do {
            System.out.println("\nDigite um número inteiro: ");
            number = read.nextInt();

            result = number * 5;

            System.out.println("\nO resultado da multiplicação é: " + result);

            couter ++;
            
        } while (couter <= 2);
        read.close();
	}

}
