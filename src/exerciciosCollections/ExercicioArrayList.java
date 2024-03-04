package exerciciosCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioArrayList {

	public static void main(String[] args) {
		
		int n;
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(2);
		numbers.add(5);
		numbers.add(1);
		numbers.add(3);
		numbers.add(4);
		numbers.add(9);
		numbers.add(7);
		numbers.add(8);
		numbers.add(10);
		numbers.add(6);
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite o número que deseja encontrar: ");
		n = read.nextInt();
		
		if (numbers.contains(n)) {
			System.out.println("A posição do número " + n + " é: " + numbers.indexOf(n));
		} else {
			System.out.println("O número " + n + " não foi encontrado");
		}
		read.close();
	}

}
