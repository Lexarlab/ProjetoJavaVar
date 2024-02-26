package ExerciciosVariáveis;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salario_bruto;
		float adicional_noturno;
		float horas_extras;
		float descontos;
		
		System.out.println("Qual valor do seu salário bruto? ");
		salario_bruto = leia.nextFloat();
		
		System.out.println("Qual o valor do adicional noturno? ");
		adicional_noturno = leia.nextFloat();
		
		System.out.println("Qual o valor das extras? ");
		horas_extras = leia.nextFloat();
		
		System.out.println("Qual o desconto: ");
		descontos = leia.nextFloat();
		
		float salario_liqui = salario_bruto + adicional_noturno + (horas_extras*5) - descontos;
		System.out.println("O seu salário liquido é: " + salario_liqui);
		
	}

}
