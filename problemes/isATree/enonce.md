#IsATree?

## Problème
On souhaite analyser une structure de données composée de sommets et d'arêtes, et déterminer s'il s'agit d'arbre ou d'un graphe.

Un arbre, par définition est un graphe connexe sans cycle,
Soit G un arbre à n sommets, il a pour propriétées:
+ Tout couple de sommets est relié par une arête unique.
+ G est sans cycle et en ajoutant une arête on en crée un.
+ G est connexe et si on supprime une arête il ne l'est plus.
+ G admet n-1 arêtes.


## Objectif

Implementer un programme qui indiquera si oui ou non un ensemble de sommets et d'arêtes représentent arbre.

## Exemple

**input**
```
 4 3
 1 2
 1 3
 2 4
```

**output**
```
 TRUE
```

Dans cet exemple on a:
+ 4 sommets et 3 arêtes.
+ le sommet 1 relié à ceux du 2 et 3.
+ le sommet 2 relié à celui du 4.

Toutes les propriétés des arbres sont validées ont peut affirmé que c'est un arbre.


## Entrée&Sortie

+ **Pour récuperer l'entrée:**

  + en [Python](https://github.com/GRnice/ConcoursJuin/blob/master/IO/entreePython.md "Python")
  + en [Java](https://github.com/GRnice/ConcoursJuin/blob/master/IO/entreeJava.md "Java")
  + En [R](https://github.com/GRnice/ConcoursJuin/blob/master/IO/entreeR.md "R")

+ **Exemple d'une entrée**
  ```
 5 3
 1 2
 1 3
 4 5
  ```
  
  + La première ligne est composée du nombre de sommets suivie par le nombre d'arêtes.
  + Les lignes suivantes représentes les couples de sommets (i,j) tel que i est le père de j.

**On suppose que les entrées sont toujours bien formés.**

### Sortie

+ Pour chaque instruction vous agirez en fonction.

	```
   FALSE
	```

# Exercices

+ **1) IST-1 - Dans un premier temps calculez le résultat à la main et envoyez-le avec un code du language qu'il vous plait.**
	+ **Exemple**

		+ **Input**
		
			```R
			4 3
            1 2
            2 3
            3 4
			```
		
		+ **Code JAVA**    
		
			```
			System.out.println("TRUE"); 
			
			```
		+ **Output**
		
			```
			TRUE 
			 ```
			 
	+ ***A vous de jouer avec cet input***
		
		+ **Input**
			
			```R
			5 4
            2 3
            2 4
            1 5
			```
            
+ **2) IST-2 - A partir des couples de sommets donnés en entrée, ecrire un code qui détermine si ils représentent un arbre ou pas.**
