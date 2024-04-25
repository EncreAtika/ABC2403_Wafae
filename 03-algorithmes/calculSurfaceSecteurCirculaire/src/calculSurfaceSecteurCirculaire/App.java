package calculSurfaceSecteurCirculaire;

import java.util.Scanner;
import java.lang.Math; // Pour les calculs dans ce cas il est necéssaire d'importer le langage java.lang.math

public class App {

	public static void main(String[] args) {
	
		double rayonR; // "double" comme float mais 64 bits
		double angleA;
		double aire;
		
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		
		System.out.println("Veuillez saisir rayonR");
		
		rayonR = sc.nextDouble();
	

		
		System.out.println("Veuillez saisir angleA");
		
		angleA = sc.nextDouble();

		
		aire = (Math.PI * Math.pow(rayonR, 2 * angleA) / 3);
		
		System.out.println("aire = : " + aire + ".");
		
		sc.close();
		
		
		
	
		

	}

}
