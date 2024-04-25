package helloYou;

import java.util.Scanner; // Besoin d'une saisi utilisateur dans ce cas il faut donc dans le cas de Java importer le scanner

public class App {

	public static void main(String[] args) {
		
		String prenom; // Déclaration d'une variable "prenom" de type "chaine de caractère"
		
		Scanner sc; // Déclaration d'une variable de type Scanner (penser à ajouter la ligne d'import (cf ligne 3)) - Le scanner est une Classe (class)
		
		sc = new Scanner(System.in); // Initialisation d'un nouveau scanner - comme le patron d'une couturière le scanner (class) est une sorte de modèle à recréer
		
		
		System.out.println("Bonjour, veuillez saisir votre prénom: "); // Affichage (c'est à dire ce qui sera lisible et demandé à l'utilisateur
		
		
		prenom = sc.nextLine(); // Demande à l'utilisateur une saisie.
		// Lorsque l'utilisateur validera avec la touche "Entrée", la saisie est récupérée dans la variable à gauche du signe "="
		
		System.out.println("Bonjour " + prenom); // Affichage
		
		
		sc.close(); // Fermeture du scanner (OBLIGATOIRE) car plus besoin - dès qu'on finit avec un scanner on le ferme
		
		

	}

}
