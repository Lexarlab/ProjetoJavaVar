package ExerciciosVariáveis;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		float n1;
		float n2;
		float n3;
		float n4;
		
		System.out.println("Dê o valor de um número: ");
		n1 = read.nextFloat();
		System.out.println("Dê o valor de um número: ");
		n2 = read.nextFloat();
		System.out.println("Dê o valor de um número: ");
		n3 = read.nextFloat();
		System.out.println("Dê o valor de um número: ");
		n4 = read.nextFloat();
		
		float calculo = (n1*n2) - (n3*n4);
		System.out.println("O valor é: " + calculo);
		
		read.close();
	}

}
