package ExerciciosVariáveis;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float n1;
		float n2;
		float n3;
		float n4;
		
		System.out.println("Dê o valor de um número: ");
		n1 = leia.nextFloat();
		System.out.println("Dê o valor de um número: ");
		n2 = leia.nextFloat();
		System.out.println("Dê o valor de um número: ");
		n3 = leia.nextFloat();
		System.out.println("Dê o valor de um número: ");
		n4 = leia.nextFloat();
		
		float calculo = (n1*n2) - (n3*n4);
		System.out.println("O valor é: " + calculo);

	}

}
