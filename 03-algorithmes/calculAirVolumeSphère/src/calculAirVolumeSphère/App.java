package calculAirVolumeSphère;

import java.util.Scanner;
import java.lang.Math; // Pour les calculs dans ce cas il est necéssaire d'importer le langage

public class App {

	public static void main(String[] args) {

		double rayonR; // Double comme float mais 64 bits
		double aire;
		double volume;

		
		Scanner sc;
		
		sc = new Scanner(System.in); 
		
		System.out.println("Veuillez saisir rayonR");
		
		rayonR = sc.nextDouble();
		
		aire = (4.0 * Math.PI * Math.pow(rayonR, 2));
		
		volume = (4.0 * Math.PI * Math.pow(rayonR, 3) / 3);
		
		System.out.println("");
		
		System.out.println("aire = : " + aire + ".");
		
		System.out.println("");
		
		System.out.println("volume = " + volume + ".");
		
		sc.close();
		
		
		
	}

}
