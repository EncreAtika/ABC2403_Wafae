# Exercice 2a.5 : Ma bicyclette

Réalisez l’algorithme et le programme correspondant au texte ci-dessous :

S’il fait beau demain, j’irai faire une balade à bicyclette.

Je n’ai pas utilisé ma bicyclette depuis plusieurs mois, peut-être n’est-elle plus en parfait état de fonctionnement.

Si c’est le cas, je passerai chez le garagiste avant la balade. J’espère que les réparations seront immédiates sinon je devrai renoncer à la balade en bicyclette. Comme je veux de toute façon profiter du beau temps, si mon vélo n’est pas utilisable, j’irai à pied jusqu’à l’étang pour cueillir les joncs.

S’il ne fait pas beau, je consacrerai ma journée à la lecture. J’aimerais relire le 1er tome de Game of Thrones. Je pense posséder ce livre, il doit être dans la bibliothèque du salon.

Si je ne le retrouve pas, j’irai l’emprunter à la bibliothèque municipale. Si le livre n’est pas disponible, j’emprunterai un roman policier.

Je rentrerai ensuite directement à la maison.

Dès que j’aurai le livre qui me convient, je m’installerai confortablement dans un fauteuil et je me plongerai dans la lecture.


##Algorithme

```

	VARIABLES
	beauTemps est un BOOLEEN
	VeloOKbalade est un BOOLEEN
	reparationImmediateOk est un BOOLEEN
	livrePossedeOk est un BOOLEEN
	livredispobibliotheque est un BOOLEEN
	
	
	TRAITEMENT
	
	* SI {il fait beau j'irai faire une balade 
		*SI velo fonctionne 
		*SINON Garagiste pour reparation 
					*Si réparation immédiate alors j'irai en balade à velo
					*SINON Balade à pied pres de l'etang pour cueillir des joncs}
					
	* SINON SI il ne fait pas beau Lecture
		*SI je possede Game Of Thrones Lecture 
		*SINON SI	je ne possede pas GAME OF THRONES je vais a la bibliotheque
			*SI bibliotheque possede Game OF THRONES je rentre chez moi pour lire dans un fauteuil
			*SINON SI bibliotheque ne possede pas Game of Thrones j'empreinte un roman policier et je rentre
			 pour lire dans un fauteil 			
					
	
	


	RESULTAT 


```
