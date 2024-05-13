# Exercice 2.4 : Je prédis l’avenir

Le programme demande à l’utilisateur de saisir 2 nombres entiers correspondant respectivement à des heures et des minutes. Le programme affichera ensuite l’heure qu’il sera 3 minutes plus tard.

Par exemple, si l’utilisateur saisit 23 puis 12 (correspondant à 23h12), le programme doit afficher Dans 3 minutes, il sera 23h15.

Si les nombres saisis par l’utilisateur sont “hors limite”, le programme affichera “Les données saisies sont invalides”

```
	VARIABLE
	
	- Heure est un nombre entier
	- Minutes est un nombre entier
	- Minutes + 3 est un nombre entier
	
	TRAITEMENT
	
	- ECRIRE "Veuillez saisir l'heure" 
	- ECRIRE "Veuillez saisir les minutes" 
	- LIRE Heure
	
	RESULTAT 
	
	- SI Heure est supérieur à 23 ou inférieur à 00 
		ET/OU SI min est supérieur à 59 et inférieur à 00
	- ALORS ECRIRE : "Les données saisies sont invalides"
	
	- SINON ECRIRE : " Dans 3 minutes il sera " , Heure + (Minutes + 3) , ,.,