# 05 Principale - Instructions itératives

Un capital est placé durant n années à un taux annuel d'intérêts composés de t%

Calculer les intérêts acquis au bout de n années.

```
VARIABLES

	nombreAnnees est un ENTIER
	i est un ENTIER
	tauxInteret est un REEL
	capitalInitial est un REEL
	capitalFinal est un REEL
	
TRAITEMENT

	ECRIRE "Quel est le montant du capital à placer (en €) ?"
	LIRE capitalInitial
	
	ECRIRE "Combien d'années le capital va-il être placé ?"
	LIRE nombreAnnees
	
	ECRIRE "Quel est le taux d'intérêt du palcement ?"
	LIRE tauxInteret
	
	capialFinal <-- capitalInitial
	
	POUR i allant de 1 à nombreAnnes (inclus)
		capiatlFinal <-- capitalFinal * (1 + tauxInteret / 100) //i++ augmente i de 1 à chaque tour de boucle
		
		FIN POUR
	
	FIN
		
RESULTAT 

	ECRIRE "Les intérêt acquis au bout de ", nombreAnnees, " an(s) sont de : "
	
	ECRIRE  capitalFinal - capitalInitial "€" // Formatage 8 chiffres dont 2 décimales
	
	
	




```