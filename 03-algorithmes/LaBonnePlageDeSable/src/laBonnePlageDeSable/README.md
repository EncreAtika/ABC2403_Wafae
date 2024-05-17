# Exercice 3.1 : La bonne plage de sable

Écrire un algorithme qui demande à l’utilisateur de saisir un nombre compris entre 1 et 3 jusqu’à ce que la réponse convienne.

Lorsque la réponse convient, afficher le nombre saisi suivi de “Bravo, vous avez réussi !”.

```
	
	VARIABLES

	saisie est un nombre entier
	compteur est nombre entier
	
	TRAITEMENT :
	
	ECRIRE "Veuillez saisir un nombre entre 1 et 3"
		
	SI compteur >1 
		ECRIRE "erreur! Veuillez resaisir un nombre entre 1 et 3"
	
	
	SINON SI saisie <  3 && saisie > 1
		ECRIRE "Bravo, vous avez réussi! c'est bien entre 1 est 3 : " , saisie ,
	FIN SI
	
	```