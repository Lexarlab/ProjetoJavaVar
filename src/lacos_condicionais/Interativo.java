package lacos_condicionais;

import java.util.Scanner;

public class Interativo {

	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
		
		int x;
		int y;
		
		System.out.println("Digite um valor para X");
		x = read.nextInt();
		
		System.out.println("Digite um valor para Y");
		y = read.nextInt();
		
		if (x > y) {
			System.out.print("X é maior que Y");
		}
		else if(x == y) {
			System.out.print("X e Y tem o mesmo valor");
		}
		else {
			System.out.print("Y é maior que X");
		}
		read.close();
	}

}
