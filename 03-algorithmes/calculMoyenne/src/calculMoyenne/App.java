package calculMoyenne;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int nombreUn; // Déclaration d'une variable "nombreUn" de type "nombre entier 32 Bits" (valeur scalaire)
	
	int nombreDeux; // Déclaration d'une variable "nombreDeux" de type "nombre entier 32 Bits" (valeur scalaire)
	
	float moyenne; // Déclaration d'une variable "moyenne" de type "nombre entier 32 Bits" (valeur scalaire)
	
	Scanner sc;
	
	sc = new Scanner(System.in); // Initialisation d'un nouveau scanner
	
	System.out.println("Veuillez saisir un premier nombre");
	
	nombreUn = sc.nextInt(); // Demande à l'utilisateur une saisie.
	
	System.out.println("Veuillez saisir un second nombre");
	
	nombreDeux = sc.nextInt();
	
	moyenne = (nombreUn+nombreDeux) / 2.0F;  //l'ajout du "F" indique que c'est un float on l'indique en "2.0F" ou "2F"
	
	System.out.println(" La moyenne de "+ nombreUn + " et "+ nombreDeux+ " est "+ moyenne+ ".");
	
	sc.close();
	
	}

}