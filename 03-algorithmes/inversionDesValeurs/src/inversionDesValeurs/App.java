package inversionDesValeurs;

import java.util.Scanner;


public class App {

	public static void main(String[] args) {

		int A; // "int" nombre entier
		int B;
		int C;
		
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		System.out.println("Saisir le premier nombre");
		A = sc.nextInt();
		System.out.println("");
		
		System.out.println("Saisir le second nombre");
		B = sc.nextInt();
		System.out.println("");
		
		System.out.println("Les valeurs sont " + A + " et " + B);
		System.out.println("");
		
		C = B;
		B = A;
		A = C;
		
		System.out.println("Les valeurs sont " + A + " et " + B);
	
		
		
		sc.close(); 
		
	}


}
