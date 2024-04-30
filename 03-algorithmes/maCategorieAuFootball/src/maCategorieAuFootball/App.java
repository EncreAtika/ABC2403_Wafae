package maCategorieAuFootball;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
	
		int Age;
		
		System.out.println("Quel âge as tu ?");
	
		Age = sc.nextInt();
		
		if(Age<5) {
			System.out.println("Tu es trop JEUNE, un peu de patience...");
			}
	
		else if(Age<=6) {
			System.out.println("Tu es un Débutant !");
		}
			
		else if(Age<=8) {
			System.out.println("Tu appartiens à la horde des POUSSINS !");
		}
		
		else if(Age<=10) {
			System.out.println("Rejoins la Team des BENJAMINS !");
		}
		
		else if(Age<=12) {
			System.out.println("Bienvenue à toi PUPILLE !");
		}
		
		else if(Age<=14) {
			System.out.println("Tu intègres la bande des MINIMES !");
			
		}
		
		else if(Age<=16) {
			System.out.println("Te voilà CADET !");
		}
		
		else if(Age<=18) {
			System.out.println("Tu as la force des JUNIORS !");
		}
		
		else if(Age<=34) {
			System.out.println("Tu es un SENIOR certainement aguerri !");
		}
		
		else if(Age>34) {
			System.out.println("Tu est un Maître VÉTÉRAN!");
		}
		
		sc.close();
		
	}

}
