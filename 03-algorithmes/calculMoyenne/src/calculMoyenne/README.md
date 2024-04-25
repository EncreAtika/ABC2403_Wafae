Exercice 1.3 : Calcul de la moyenne de 2 nombres

L'utilisitateur est invité à saisir 2 nombres entiers

Le programme calcule la moyenne de 2 nombres et affiche le résultat sous forme de nombre décimal.
Si on a du mal à rédiger un psedo code on le détaille (ligne 8 à 17)

``` 
   Le programme affiche "veuillez saisir un premier nombre"
   	L'utilisateur saisit un nombre
   	Le nombre saisi est stocké dans une variable
   	Le programme affiche "Veuillez saisir un 2nde nombre"
   	L'utilisateur saisit un nombre
   	Le nombre saisi est stocké dans une autre variable
   	Me programme calcule la moyenne des 2 nombres
   	Le résultat est stocké dans une variable
   	Le programme affiche le résultat du calcul
``` 

``` 
VARIABLE
	nombreUn est un nombre entier
   	nombreDeux est un nombre entier
   	moyenne est un nombre réel

TRAITEMENT
    AFFICHER "veuillez saisir un premier nombre"
    LIRE nombre1
    AFFICHER "veuillez saisir un second nombre"
    LIRE nombre2
    
    moyenne <-- (nombreUn + nombreDeux) / 2

RESULTAT 

ECRIRE "La moyenne de ", nombreUn, " et ", nombre Deux " est ", moyenne, "."
    ( note personnelle : Le résultat qui s'afficherait :)
    
    // "La moyenne de 12 et 81 est 46,5")
``` 