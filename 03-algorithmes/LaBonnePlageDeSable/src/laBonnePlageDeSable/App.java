package laBonnePlageDeSable;

		import java.util.Scanner;

		public class App {

			public static void main(String[] args) 
			{
			int saisie;
			int compteur = 1;
				
				Scanner sc = new Scanner(System.in);
				
					do {
					
						if (compteur>1) {
							
							System.out.println("erreur! Veuillez resaisir un nombre entre 1 et 3" );
						}
						else {
							System.out.println("Veuillez saisir un nombre entre 1 et 3" );
						}
						
						saisie=sc.nextInt();
							compteur++;
					
						} while (saisie <1 || saisie >3);
						System.out.println("Bravo, vous avez réussi! c'est bien entre 1 est 3 : " + saisie );
				
			}

}
