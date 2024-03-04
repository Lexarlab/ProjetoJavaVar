package collections;

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {

	public static void main(String[] args) {
		
		Set<String> setFruits = new HashSet<String>();
		
		setFruits.add("Banana");
		setFruits.add("Jaboticaba");
		setFruits.add("Kiwi");
		setFruits.add("Maçã");
		setFruits.add("Morango");
		setFruits.add("Pêra");
		setFruits.add("Jaboticaba");
		setFruits.add("Kiwi");
		
		System.out.println("\nDados da Collaction: " + setFruits);
		
		for(String fruit: setFruits) {
			if(fruit != null) {
				System.out.println("A posição de " + fruit + " é " + fruit.hashCode());
			}
		}
	}

}
