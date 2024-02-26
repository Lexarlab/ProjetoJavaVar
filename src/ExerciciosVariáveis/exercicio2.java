package ExerciciosVariáveis;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
			Scanner leia = new Scanner(System.in);
			
			float nota1;
			float nota2;
			float nota3;
			float nota4;
			
			System.out.println("Qual a primeira nota: ");
			nota1 = leia.nextFloat();
			
			System.out.println("Qual a segunda nota: ");
			nota2 = leia.nextFloat();
			
			System.out.println("Qual a terceira nota: ");
			nota3 = leia.nextFloat();
			
			System.out.println("Qual a quarta nota: ");
			nota4 = leia.nextFloat();
			
			float media_final = (nota1 + nota2 + nota3 + nota4)/4;
			
			System.out.printf("A média final é: %.1f", media_final);
			
	}

}
