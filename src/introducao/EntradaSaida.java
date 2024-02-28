package introducao;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		
		String name;
		int age;
		
		//input
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com seu nome: ");
		name = leia.next();
		
		System.out.println("Entre com sua idade: ");
		age = leia.nextInt();
				
		System.out.println("Olá, " + name + "! Seja bem-vinda ao bootcamp de Full Stack JAVA");
		System.out.println("Sua idade é " + age + " anos.");
		
		leia.close();
	}
	
}
