package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploFila {

	public static void main(String[] args) {
		
		Queue<Integer> line = new LinkedList<Integer>();

		for (int i = 0; i <= 10; i++) 
			line.add(i);

		System.out.println("\nElementos na fila: "	+ line);
		
		System.out.println("\nRemover Elemento: " + line.remove());

		System.out.println("\nFila atualizada: " + line);
		
		System.out.println("\nAdicionar Elemento 11: " + line.add(11));

		System.out.println("\nExibir a Fila atualizada: " + line);

		System.out.println("\nExibir o Primeiro Elemento da fila: " + line.peek());
		
		
		Iterator<Integer> x = line.iterator();
		
		while(x.hasNext()) {
			System.out.println(x.next());
		}
	}

}
