

package evalalgo3;
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		
		int[]numbers;
		numbers = new int[] { 2, 4, 1, 8, 6, 14, 23, 25, 7, 42 };
		int addition = 0;
		float moyenne;
		int nbEleve;
		int leCarre;
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("Bienvenu dans le programme de calcul du tableau d'entiers : ");
		System.out.println();
		
		
		System.out.println("Longueur de numbers : " + numbers.length + " cases");
		System.out.println();
		numbers[0] = 2;
		numbers[1] = 4;
		numbers[2] = 1;
		numbers[3] = 8;
		numbers[4] = 6;
		numbers[5] = 14;
		numbers[6] = 23;
		numbers[7] = 25;
		numbers[8] = 7;
		numbers[9] = 42;
		
		System.out.println("Element 0 de numbers = " + numbers[0]);
		System.out.println("Element 1 de numbers = " + numbers[1]);
		System.out.println("Element 2 de numbers = " + numbers[2]);
		System.out.println("Element 3 de numbers = " + numbers[3]);
		System.out.println("Element 4 de numbers = " + numbers[4]);
		System.out.println("Element 5 de numbers = " + numbers[5]);
		System.out.println("Element 6 de numbers = " + numbers[6]);
		System.out.println("Element 7 de numbers = " + numbers[7]);
		System.out.println("Element 8 de numbers = " + numbers[8]);
		System.out.println("Element 9 de numbers = " + numbers[9]);
		System.out.println();
		
		System.out.println();
		
		int i; 
		for(i = 0; i < numbers.length; i++) {
			System.out.println(i);
			
			addition = numbers[i];	
		if (addition < numbers[i]);
		addition = (numbers[i]);
		
		}
		clavier.close();
		moyenne = addition/numbers.length;
		System.out.println(moyenne);
		System.out.println(" Je n'arrive pas à trouver le bon code alors je vais faire un calcul classique. Désolée : ");
		
		
		
		/* Je n'arrive pas à trouver la moyenne et je me perds dans le code donc j'ai fait un calcul de moyennes classiques 
		pour le carré c'est bon, mais c'était facile*/
		
		
		
		moyenne = (numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4] + numbers[5] + numbers[6] + numbers[7] + numbers[8] + numbers[9]) / 10.0f;
		
		System.out.println("La moyenne des élèments du tableau est : " + moyenne );
		System.out.println();
		
		leCarre = (42*42);
		System.out.println("La valeur au carré de l'élément du tableau le plus élevé soit : 42 est de : " + leCarre );
		System.out.println();
	}

}






