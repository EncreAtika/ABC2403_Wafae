
import java.util.Scanner;

public class Principale05 {

	public static void main(String[] args) {
		int nombreAnnees,i ;
		double tauxInteret, capitalInitial, capitalFinal;
		
		nombreAnnees = 0; i = 0;
		tauxInteret = 0.; capitalInitial = 0.; capitalFinal = 0.;
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.print("Quel est le montant du capital à placer (en €) ? ");
		capitalInitial = clavier.nextDouble();
		
		System.out.print("Combien d'années le capital va-il-être placé ? ");
		nombreAnnees = clavier.nextInt();
		
		System.out.print("Quel est le taux d'intérêt du placement ? ");
		tauxInteret = clavier.nextDouble();
		capitalFinal = capitalInitial;
		
		for (i = 1; i <= nombreAnnees; i++) { //i++ augmente i de 1 à chaque tour de boucle
			capitalFinal = (1+ tauxInteret/100)*capitalFinal;
		
			System.out.print("Les intérêts acquis au bout de " + nombreAnnees + " an(s) sont de ");
			
			System.out.printf("%6.2f", capitalFinal - capitalInitial ); // Formatage 8 chiffres dont 2 décimales
			
			System.out.print(" €");
			
			clavier.close();
		}

	}

}
