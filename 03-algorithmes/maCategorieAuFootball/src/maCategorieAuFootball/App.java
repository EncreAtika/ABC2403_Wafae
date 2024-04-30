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
	
		if(Age<=6) {
			System.out.println("Tu es un Débutant !");
		}
			
		if(Age<=8) {
			System.out.println("Tu appartiens à la horde des POUSSINS !");
		}
		
		if(Age<=10) {
			System.out.println("Rejoins la Team des BENJAMINS !");
		}
		
		if(Age<=12) {
			System.out.println("Bienvenue à toi PUPILLE !");
		}
		
		if(Age<=14) {
			System.out.println("Tu intègres la bande des MINIMES !");
			
		}
		
		if(Age<=16) {
			System.out.println("Te voilà CADET !");
		}
		
		if(Age<=18) {
			System.out.println("Tu as la force des JUNIORS !");
		}
		
		if(Age<=34) {
			System.out.println("Tu es un SENIOR certainement aguerri !");
		}
		
		if(Age>34) {
			System.out.println("Tu est un Maître VÉTÉRAN!");
		}
		
		sc.close();
		
	}

}
