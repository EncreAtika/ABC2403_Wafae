package demoWhile;

public class App {

	
	/**
	 * VARIABLES
	 * i est un entier
	 * 
	 * TRAITEMENT
	 * i <-- 0
	 */
	 
	public static void main(String[] args) {
		 
		int i = 0;
		
		/** TANT QUE i <= 10
		 * 	ECRIRE "i vaut ", i
		 * 	i++
		 * FIN TANT QUE
		 */
		
		while(i <= 10) {
			System.out.println("i vaut " + i);
			i++;
		}
		
		/** 
		 * FAIRE 
		 * ECRIRE "i vaut ", i
		 * i++
		 * TANT QUE <=10
		 * FIN TANT QUE
		 */
		do {
			System.out.println("i vaut " + i);
			i++;
		} while(i <= 10);

	
		int j = 0;
		
		/** 
		 * 	POUR j de 0 à 10, j++) (INCREMENTER j)
		 * 	ECRIRE "j vaut ",j
		 * FIN POUR
		 */
		
		for(j=0; j <= 10; j++ );
				System.out.println("j vaut " + j);
		
		
	}

}
