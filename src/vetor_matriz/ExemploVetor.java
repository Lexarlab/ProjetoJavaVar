package vetor_matriz;

import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		
		String dogs[]= new String[3];
		
		Scanner read = new Scanner(System.in);
		int index;
		
		for(index = 0; index < 3; index++) {
			
			System.out.println("Digite o " + (index + 1) + "º nome: ");
			dogs[index] = read.nextLine();
		}
		
		System.out.println("Cachorros: ");
		
		for(index = 0; index < dogs.length; index++) {
			
			System.out.print(dogs[index]);
			
		}
		read.close();
	}

}
