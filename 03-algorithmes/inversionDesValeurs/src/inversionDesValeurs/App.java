package inversionDesValeurs;

import java.util.Scanner;


public class App {

	public static void main(String[] args) {

		int A; // "int" nombre entier
		int B;
		int C;
		
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir A");
		A = sc.nextInt();
		System.out.println("");
		
		System.out.println("Veuillez saisir B");
		B = sc.nextInt();
		System.out.println("");
		
		C = A;
		A = B;
		B = C;
		
		System.out.println("Le nombre A devient le nombre B soit: " + B +  " et le nombre B devient le nombre A soit: " + A + ".");
		
		sc.close(); 
		
	}

}
