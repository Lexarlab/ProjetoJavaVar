package lacos_repeticao;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
		
		String name;
		int couter; 
		
		Scanner read = new Scanner(System.in);
        
        for (couter = 1; couter < 4; couter++) {
        	 System.out.println("Digite o " + couter + "º nome: ");
             name = read.nextLine();
             System.out.println("O " + couter + "º nome é: " + name + "\n");
        }
        read.close();
	}

}
