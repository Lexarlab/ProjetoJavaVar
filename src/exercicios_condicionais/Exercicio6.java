package exercicios_condicionais;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		String name;
		int codeC;
		float salary;
		float newSalary;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Entre com seu nome: ");
		name = read.nextLine();
		;
		
		System.out.println("Entre com o código de cargo: ");
		codeC = read.nextInt();
		
		System.out.println("Entre com seu salário: ");
		salary = read.nextFloat();
		
		switch(codeC) {
			case 1:
				newSalary = (float) (1.10 * salary);
				System.out.println("Nome do colaborador: " + name + "\nCargo: Gerente \nNovo salário: R$" + newSalary);
				break;
			case 2:
				newSalary = (float) (1.07 * salary);
				System.out.println("Nome do colaborador: " + name + "\nCargo: Vendedor \nNovo salário: R$" + newSalary);
				break;
			case 3:
				newSalary = (float) (1.09 * salary);
				System.out.println("Nome do colaborador: " + name + "\nCargo: Supervisor \nNovo salário: R$" + newSalary);
				break;
			case 4:
				newSalary = (float) (1.06 * salary);
				System.out.println("Nome do colaborador: " + name + "\nCargo: Motorista \nNovo salário: R$" + newSalary);
				break;
			case 5:
				newSalary = (float) (1.05 * salary);
				System.out.println("Nome do colaborador: " + name + "\nCargo: Estoquista \nNovo salário: R$" + newSalary);
				break;
			case 6:
				newSalary = (float) (1.08 * salary);
				System.out.println("Nome do colaborador: " + name + "\nCargo: Técnico de TI \nNovo salário: R$ " + newSalary);
				break;
		}
		
		read.close();
		

	}

}
