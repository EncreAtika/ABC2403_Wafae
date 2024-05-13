package jePredisLAvenir;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		int Heure;
		int Minutes;
		int MinutesPlus3;
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		System.out.println("Veuillez indiquer l'heure");
		Heure = sc.nextInt();
		
		System.out.println("Veuillez indiquer les minutes");
		Minutes = sc.nextInt();
		
		
		if (Heure > 23 || Heure < 0 || Minutes > 59 || Minutes < 0) {
			System.out.println("Les données saisies sont invalides");
		} else {
			
		MinutesPlus3 = Minutes + 3;
		
				if (MinutesPlus3 > 60) {
					MinutesPlus3 -= 60;
					Heure += 1;
				}
				
				if (Heure > 23) {
					Heure = 0;	
					}
				
						System.out.println("Dans 3 minutes, il sera " + Heure + "h " + MinutesPlus3);
						
		}
				
		
		sc.close();

	}

}