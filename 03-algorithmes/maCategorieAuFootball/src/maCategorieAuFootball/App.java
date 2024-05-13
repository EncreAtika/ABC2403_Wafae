package maCategorieAuFootball;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
	
		int age;
		
		System.out.println("Quel âge as tu ?");
	
		age = sc.nextInt();
		
		if(age<5) {
			System.out.println("Tu es trop JEUNE, un peu de patience...");
			}
	
		else if(age<=6) {
			System.out.println("Tu es un Débutant !");
		}
			
		else if(age<=8) {
			System.out.println("Tu appartiens à la horde des POUSSINS !");
		}
		
		else if(age<=10) {
			System.out.println("Rejoins la Team des BENJAMINS !");
		}
		
		else if(age<=12) {
			System.out.println("Bienvenue à toi PUPILLE !");
		}
		
		else if(age<=14) {
			System.out.println("Tu intègres la bande des MINIMES !");
			
		}
		
		else if(age<=16) {
			System.out.println("Te voilà CADET !");
		}
		
		else if(age<=18) {
			System.out.println("Tu as la force des JUNIORS !");
		}
		
		else if(age<=34) {
			System.out.println("Tu es un SENIOR certainement aguerri !");
		}
		
		else if(age>34) {
			System.out.println("Tu est un Maître VÉTÉRAN!");
		}
		
		sc.close();
		
	}

}
