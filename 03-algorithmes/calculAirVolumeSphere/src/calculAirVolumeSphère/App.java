package calculAirVolumeSphère;

import java.util.Scanner;
import java.lang.Math; // Pour les calculs dans ce cas il est necéssaire d'importer le langage

public class App {

	public static void main(String[] args) {

		double R; // Rayon de  la sphère -- "Double" comme float mais 64 bits
		double aire;
		double volume;

		
		Scanner sc;
		
		sc = new Scanner(System.in); 
		
		System.out.println("Saisir rayon R :");
		
		R = sc.nextDouble();
		
		aire = (4.0 * Math.PI * Math.pow(R, 2));
		
		volume = (4.0 * Math.PI * Math.pow(R, 3)) / 3;
		
		System.out.println("");
		
		System.out.println("Donc l'aire de la sphère est de :  " + aire + ".");
		
		System.out.println("");
		
		System.out.println("Le  volume de la sphère est de : " + volume + ".");
		
		sc.close();
		
		
		
	}

}
