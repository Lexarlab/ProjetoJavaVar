package exercicios_condicionais;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		int item;
		int quant;
		float totalPrice;
		
		Scanner read = new Scanner (System.in);
		
		System.out.println("Digite o código do produto (1 a 6):");
		item = read.nextInt();
		
		System.out.println("Escolha a quantidade:");
		quant = read.nextInt();
		
		switch (item) {
			case 1:
				totalPrice = quant * 10;
				System.out.println("Produto: Cachorro quente \nValor total: R$" + totalPrice);
				break;
			case 2:
				totalPrice = quant * 15;
				System.out.println("Produto: X-Salada \nValor total: R$" + totalPrice);
				break;
			case 3:
				totalPrice = quant * 18;
				System.out.println("Produto: X-Bacon \nValor total: R$" + totalPrice);
				break;
			case 4:
				totalPrice = quant * 12;
				System.out.println("Produto: Bauru \nValor total: R$" + totalPrice);
				break;
			case 5:
				totalPrice = quant * 8;
				System.out.println("Produto: Refrigerante \nValor total: R$" + totalPrice);
				break;
			case 6:
				totalPrice = quant * 13;
				System.out.println("Produto: Suco de Laranja \nValor total: R$" + totalPrice);
				break;
	
			}
		
		read.close();
		
	}

}
