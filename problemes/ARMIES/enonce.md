# ARMY

## Problème
Dans une liste de nombres représentant la puissant de feu de 2 armées qui s'affrontent, vous allez devoir trouver le vainqueur de la bataille!

## Objectif
L'objectif est donc de**détecter** le vainqueur en analysant la puissance de feu de ces divisions. Pour cela vous allez devoir additionner la puissance de feu de toutes les divisions de l'armée.

## Entrée & sortie:
Votre programme devra traiter les paramètres donnés en entrée, et fournir une solution via une fonction d'affichage...

Chaque bataille est rerésentée par 4 lignes dans le fichier. Pour chaque chaque ensemble de 4 lignes, les 2 premieres lignes concernent l'equipe "Zerg" , et les deux dernieres l'équipe "Terran".
Dans les deux lignes , la première indique le nombre de division que l'armée possède, la ligne suivante indique pour chaque division sa puissance de feu.

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

+ Pour chaque bataille, les 2 premières lignes représentent l'armée nommée "Zerg" et les 2 suivantes représentent l'armée nommée "Terran". Il suffira juste d'afficher le nom du vainqueur, en cas d'égalité vous afficherez "Draw". 

Si votre programme reçoit l'entrée vue ci-dessus , votre programme devra afficher les messages suivants sur l'écran
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

Cette fois ci implementez un programme qui traitera les entrées , il devra résoudre le problème et afficher le résultat obtenu.
**N'oubliez pas de terminer l'affichage du résultat par un retour à la ligne.**
