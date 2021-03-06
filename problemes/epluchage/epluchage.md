#EPLUCHAGE TO INT

## Problème
**L'épluchage consiste** à compter le nombre d'occurrences d'un chiffre dans un nombre N (exemple dans 131, le chiffre 1 apparait deux fois)

## Objectif
Le but de cet exercice est de manipuler ces occurrences afin de former un nouveau nombre M à partir d'un entier N. Pour former M, on ne concatènera pas les occurrences (supérieures à zéro) selon l'ordre d'apparition du chiffre mais selon l'ordre croissant.


## Exemple
**Input**

  ```
   211120129
  ```

**Output**
  ```
   1431
   
  ```
  
Dans cette exemple nous pouvons voir qu'il y a **une** occurrence du chiffre 0, **quatre** occurrences du chiffre 1, **trois** du chiffre 2 et **une** occurrence de 9


## Entrée & sortie :
Votre programme devra traiter les paramètres donnés en entrée, et fournir une solution via une fonction d'affichage...

### Entrée

+ **Pour récupérer l'entrée:**

  + En [python](https://github.com/GRnice/ConcoursJuin/blob/master/IO/entreePython.md  "python")
  + En [C++](https://github.com/GRnice/ConcoursJuin/blob/master/IO/entreeCPP.md  "C++")
  + En [C](https://github.com/GRnice/ConcoursJuin/blob/master/IO/entreeC.md "C")
  + En [Java](https://github.com/GRnice/ConcoursJuin/blob/master/IO/entreeJava.md "Java")
  + En [R](https://github.com/GRnice/ConcoursJuin/blob/master/IO/entreeR.md "Java")

+ **Exemple d'une entrée**
  ```
   5412
   
  ```

### Sortie

+ Pour chaque instruction vous agirez en fonction.

	```
   1111
   
	```
**La sortie se terminera sur un retour à la ligne**


# Exercices:

+ **1) EPLUCHE1 - Dans un premier temps calculez le résultat à la main et envoyez-le avec un code du langage de votre choix.**

	+ **Exemple**
	
	    + **Input**
	
		    ```R
		   1101112229
		    ```
	    + **Code JAVA**
		    
		    ```
		   System.out.println(1531);
		    ```
	    + **Output**
	    
		    ```
		   1531 
		   
		    ```
		 
	+ ***A vous de jouer avec cet input***
	     + **Input**
	     
		    ```
		   685415111
		    ```
 
+ **2) EPLUCHE2 - Ecrire le code qui renvoie M à partir du N récupéré en entrée. **

   
+ **3) EPLUCHE3 - Reprendre le code de la question 2, renvoyez M maintenant en excluant cette fois-ci le nombre d'occurrences du chiffre 0.**

    + **Exemple**
    
    	+ **Input**
    	
    		```	
	   	1100011192229
	    	```
	    	
		+ **Output**
			```
			532
			
			```


