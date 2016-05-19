# ARMY

## Problème
Dans une liste de nombre représentant la puissant de feu de 2 armées qui s'affronte, vous allez devoir trouver le vainqueur de la bataille!

## Objectif
L'objectif est donc de**détecter** le vainqueur en analysant la puissance de feu de ces divisions. Pour cela vous allez devoir additionner la puissance de feu de toutes les divisions de l'armée.

## Entrée & sortie:
Votre programme devra traiter les paramètres donnés en entrée, et fournir une solution via une fonction d'affichage...

### Entrée

+ **Pour récuperer l'entrée:**

  + en Python lien Ici (pas encore bon)
  + en [Java](https://github.com/GRnice/ConcoursJuin/blob/master/IO/entreeJava.md "Java")

+ **Exemple d'une entrée**
  ```
  3
  1 3 4
  3
  4 4 1
  4
  2 5 3 4
  3
  5 6 4
  4
  6 1 2 5
  4
  5 2 6 1
  ```

### Sortie

+ Pour chaque instruction vous agirez en fonction.

```
  vainqueur
```

## Aspect technique:
Il existe en tout et pour tout 4 instructions qui sont les suivantes:
  + ```CREATECOUNT nom_compte```: crée un compte qui a pour nom ```nom_compte```
  + ```DELETECOUNT nom_compte```: supprime le compte qui a pour nom ```nom_compte```
  + ```CREDITCOUNT nom_compte somme```: crédite ```somme``` au compte qui a pour nom ```nom_compte```
  + ```DEBITECOUNT nom_compte somme```: débite ```somme``` au compte qui a pour nom ```nom_compte```

Pour chaque opération, vous devez afficher le nom du compte sur lequel est réalisé une opération et son solde spéaré par ```:```.

En cas de création de compte vous fixerez le solde du compte à 0.

En cas de suppréssion de compte vous fixerez le solde compte à ```null```.

# Exercices:

1) Résoudre le problème énoncé au dessus.


