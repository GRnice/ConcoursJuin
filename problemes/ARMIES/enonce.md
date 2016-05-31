# ARMY

## Problème
Dans une liste de nombres représentant la puissance de feu de 2 armées qui s'affrontent, vous allez devoir trouver le vainqueur de la bataille!

## Objectif
L'objectif est de **détecter** le vainqueur en evaluant la puissance de feu des divisions de chaque faction. Pour cela vous allez devoir additionner la puissance de feu de toutes les divisions de l'armée.

## Entrée & sortie:
Votre programme doit traiter les paramètres donnés en entrée, et fournir une solution via une fonction d'affichage...

 La guerre est composé de plusieurs batailles, chaque bataille est représentée par 4 lignes dans le fichier. 
 Pour chaque bataille, les 2 premières lignes concernent l'armée "Zerg" , et les 2 dernières l'armée "Terran".
 Pour chaque armée , la première ligne indique le nombre de divisions qu'elle possède, la ligne suivante indique pour chaque division sa puissance de feu.

### Entrée

+ **Pour récuperer l'entrée:**

  + En [python](https://github.com/GRnice/ConcoursJuin/blob/master/IO/entreePython.md  "python")
  + En [C++](https://github.com/GRnice/ConcoursJuin/blob/master/IO/entreeCPP.md  "C++")
  + En [C](https://github.com/GRnice/ConcoursJuin/blob/master/IO/smartStack/entreeC.md "C")
  + En [Java](https://github.com/GRnice/ConcoursJuin/blob/master/IO/entreeJava.md "Java")
  + En [R](https://github.com/GRnice/ConcoursJuin/blob/master/IO/entreeR.md "Java")

+ **Exemple d'une entrée**
  ```
  3         # 3 divisions pour Zerg
  1 3 4     # la valeur de chaque division de Zerg
  3         # 3 divisions pour Terran
  4 4 1     # la valeur de chaque division de Terran
  4         # 4 divisions pour Zerg
  2 5 3 4   # la valeur de chaque division de Zerg
  3         # etc...
  5 6 4     # etc ...
  4         # etc...
  6 1 2 5
  4
  5 2 6 1
  ```

### Sortie

+ Pour chaque bataille, affichez le nom du vainqueur, en cas d'égalité affichez "Draw".

Si votre programme reçoit l'entrée vue ci-dessus , votre programme doit afficher les messages suivants sur l'écran
```
Terran
Terran
Draw

```
L'affichage se **terminera sur un retour à la ligne**

# Exercices:

+ **1) ARM-1 - Résoudre sur papier.**

Pour l'entrée donnée :
```
5
7 8 9 4 1
8
1 2 3 4 5 6 7 8
2
11 2
1
13
3
12 2 8
5
8 9 1 1 2
```
Résolvez le problème à la main et implementer un programme qui **affichera uniquement** le résultat obtenu sur papier.
**N'oubliez pas de terminer l'affichage du résultat par un retour à la ligne.**

+ **2) ARM-2 - Implementer le programme**

Cette fois ci implementez un programme qui traite les entrées , il devra résoudre le problème et afficher le résultat obtenu.
**N'oubliez pas de terminer l'affichage du résultat par un retour à la ligne.**
