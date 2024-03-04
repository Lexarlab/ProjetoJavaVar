package exerciciosCollections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

	public static void main(String[] args) {
		
		int option;
		
		Queue <String> line = new LinkedList<String>();
		
		Scanner read = new Scanner(System.in);
		
		do {
			System.out.println("\n---- MENU ----");
	        System.out.println("1: Adicionar um novo Cliente na fila");
	        System.out.println("2: Listar todos os Clientes na fila");
	        System.out.println("3: Retirar uma pessoa da fila");
	        System.out.println("0: Sair do programa");
	        System.out.print("Entre com a opção desejada: ");
			option = read.nextInt();
			read.nextLine();
			
			switch (option) {
				case 1: 
					System.out.println("\nDigite o nome do cliente: ");
					String name = read.nextLine();
					line.add(name);
					System.out.println("\nCliente adicionado à fila." + line);
					break;
				case 2:
					if(line.isEmpty()){ 
						System.out.println("\nA fila está vazia.");	
					} else {
						System.out.println("\nClientes na fila: " + line);
					}
					break;
				case 3:
					if(line.isEmpty()){ 
						System.out.println("\nA fila está vazia.");	
					} else {
						System.out.println("\nRetirar cliente da fila: ");
						name = read.nextLine();
						line.remove();
						System.out.println("\nCliente foi Chamado: " + line);
					}
					break;
				case 0:
					System.out.println("Programa Finalizado!");
					break;
				default: 
					System.out.println("Opção inválida. Tente novamente.");
				}
			} while	(option!=0);
			
		read.close();
		
	}

}
