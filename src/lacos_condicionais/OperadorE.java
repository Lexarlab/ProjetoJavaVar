package lacos_condicionais;

import java.util.Scanner;

public class OperadorE {

	public static void main(String[] args) {
		
		int age;
		boolean CNH;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite sua idade:");
		age = read.nextInt();
		
		System.out.println("Você tem carteira de habilitação? (true/false)");
		CNH = read.nextBoolean();
		
		if( age >= 18 && CNH == true) {
			System.out.print("Pode dirigir!");
		}
		else {
			System.out.print("Não pode dirigir");
		}
		read.close();
	}
	
}
