package exercicios_repeticao;

import java.util.Scanner;

public class Exercicio1For {

	public static void main(String[] args) {
		
		int couter;
		int number;
		int even = 0;
		int odd = 0;
		
		Scanner read = new Scanner(System.in);
		
		for (couter = 1; couter < 11; couter++) {
			
			System.out.println("Digite o " + couter + "º número: ");
            number = read.nextInt();
        	
            if (number%2 == 0) {
            	even++;
    		}
            else {
            	odd ++;
            }
                  
		}
		System.out.print("Pares são: " + even + "\nÍmpares são: " + odd);
		read.close();
	}
	
}
