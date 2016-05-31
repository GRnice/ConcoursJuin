#PERMUTATION AMBIGÜE

## Problème
**Une permutation inverse** d'un ensemble X est une bijection de X sur lui-même où chaque élement i de cet ensemble se retrouve à la i-éme position du nouvel ensemble obtenue.
Il y a **permutation ambigüe** lorsqu'on applique une permutation inverse à un ensemble X et que l'ensemble X' obtenue est le même que l'ensemble de départ X.

## Objectif
On vous donne deux listes d'entiers de même taille, le but est de savoir si une liste est permutation ambigüe ou pas de l'autre liste.
Si une liste est permutation ambigüe , votre programme affichera ```TRUE```
Sinon il affichera ```FALSE```


## Exemple

**input**
  ```
   4 
   1 4 3 2 
   1 4 3 2
  ```
  
**output**
  ```
  TRUE
  
  ```
  
La deuxieme liste est obtenue par **permutation inverse** de la premiere liste,  de plus on observe qu'elles sont identiques il y a donc **permutation ambigüe**

La première ligne représente la liste L1 et la deuxième la liste L2.
  +	On peut observer que le premier élément de L1 est un **un** d'indice **1**, on retouve donc à l'indice **1** de L2 l'élément **un**.
  +	Le deuxième élément de L1 est un **quatre** d'indice **2**, on retrouve donc à l'indice **4** de L2 l'élément **deux**.
  +	Le troisième élément de L1 est un **trois** d'indice **3**, on retrouve donc à l'indice **3** de L2 l'élément **trois**.
  +	Le quatrième élément de L1 est un **deux** d'indice **4**, on retrouve donc à l'indice **2** de L2 l'élément **quatre**.


## Entrée & sortie:
Votre programme devra traiter les paramètres donnés en entrée, et fournir une solution via une fonction d'affichage...

### Entrée

+ **Pour récuperer l'entrée:**

  + En [python](https://github.com/GRnice/ConcoursJuin/blob/master/IO/entreePython.md  "python")
  + En [C++](https://github.com/GRnice/ConcoursJuin/blob/master/IO/entreeCPP.md  "C++")
  + En [C](https://github.com/GRnice/ConcoursJuin/blob/master/IO/entreeC.md "C")
  + En [Java](https://github.com/GRnice/ConcoursJuin/blob/master/IO/entreeJava.md "Java")
  + En [R](https://github.com/GRnice/ConcoursJuin/blob/master/IO/entreeR.md "Java")

+ **Exemple d'une entrée**
  ```
   4
   1 4 3 2 
   1 4 3 2
  ```

### Sortie

+ Elle est caractérisée soit par une sortie à ```TRUE``` ou soit à ```FALSE```

	```
   TRUE
   
	```
**L'affichera se terminera sur un retour à la ligne**
    
## ASPECTS TECHNIQUES


 **Exemple Permutation inverse**:

  + **Input**
  
     ```R
     5
     2 3 4 5 1 
     5 1 2 3 4
     ```
    
  + **Output**
  
     ```R
     TRUE
     
     ```
     La première ligne représente la liste L1 et la deuxième la liste L2.
     +	On peut observer que le premier élément de L1 est un **deux** d'indice **1**, on retouve donc à l'indice **2** de L2 l'élément **un**.
     +	Le deuxième élément de L1 est un **trois** d'indice **2**, on retrouve donc à l'indice **3** de L2 l'élément **deux**.
     +	Le troisième élément de L1 est un **quatre** d'indice **3**, on retrouve donc à l'indice **4** de L2 l'élément **trois**.
     +	Le quatrième élément de L1 est un **cinq** d'indice **4**, on retrouve donc à l'indice **5** de L2 l'élément **quatre**.
     +	Le cinquième élément de L1 est un **un** d'indice **5**, on retrouve donc à l'indice **1** de L2 l'élément **un**.

# Exercices:

+ **1) PERM-1 - Dans un premier temps calculez le résultat à la main et envoyez-le avec un code du language qu'il vous plait.**
	+ **Exemple**

		+ **Input**
		
			```R
			6
			1 4 5 2 3 6
			1 2 3 4 5 6
			```
		
		+ **Code JAVA**    
		
			```
			System.out.println("FALSE"); 
			
			```
		+ **Output**
		
			```
			FALSE 
			
			 ```
			 
	+ ***A vous de jouer avec cet input***
		
		+ **Input**
			
			```R
			10
			3 8 5 10 9 4 6 1 7 2
			8 10 1 6 3 2 9 7 5 4
			```
 
+ **2) PERM-2 - Permutation ambigüe I:
	Ecrivez un code , qui vérifie si la liste L2 est la liste obtenue par permutation ambigüe de L1, L1 et L2 toutes deux récupérées en entrée.
    Renvoyez ```TRUE``` ou ```FALSE```**

	+ **Exemple**

		+ **Input**
		
			```
			6
			1 2 3 5 4 6
    		1 2 3 5 4 6
			```

		+ **Output**
		
			```
			TRUE 
			
			 ```


+ **3)  PERM-3 - Permutation ambigüe II:
	Maintenant on applique sur chaqun des éléments de L2 **```f(x) = 2 * x + 3```**, écrivez cette fois ci un code R, qui à partir des listes L1 et L2 récupérées entrée, vérifie si L2 avant application de f(x) est la liste obtenue par permutation ambigüe de L1.
     Renvoyez ```TRUE``` ou ```FALSE```**

	+ **Exemple**

		+ **Input**
		
			```
			4
	       1 4 3 2 
   	    5 11 9 7
			```

		+ **Output**
		
			```
			TRUE 
			
			 ```



