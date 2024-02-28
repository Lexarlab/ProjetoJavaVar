package ExerciciosVariáveis;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		float salary;
		float bonus;

		Scanner read = new Scanner(System.in);
		
		System.out.println("Qual seu salário? ");
		salary = read.nextFloat();
		
		System.out.println("Qual seu abono? ");
		bonus = read.nextFloat();
		
		float new_salary = salary + bonus;
		
		System.out.println("Seu novo salário é: " + new_salary);
		
		read.close();
	}
	
}
