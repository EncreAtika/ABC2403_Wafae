package lesBouclesTafPerso;

import java.util.*;

public class App {

	public static void main(String[] args) 
	{
	int saisie;
		
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Veuillez saisir un nombre entre 1 et 3" );
			saisie=sc.nextInt();
			
		} while (saisie <1 || saisie >3);

		System.out.println("Bravo, vous avez réussi! c'est bien entre 1 est 3 :" + saisie );
		
	/*	do
		{
			i++;
			
			if(i == 5)
					continue;
			
		    System.out.println(i);
			
			
		}
		while(i != 10);
	*/ 
		
	}

}

