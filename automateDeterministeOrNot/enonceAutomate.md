# Automate deterministe or not

## Problème:
On souhaite évaluer un automate donné en paramètre pour indiquer en sortie , (via une fonction d'affichage)
si il est deterministe ou non

## Objectif:
Pour chaque automate , votre programme doit indiquer si il est deterministe ou pas.

## Entrée & sortie:

Votre programme devra traiter les paramètres donnés en entrée , et fournir un résultat via une fonction d'affichage...

### Entrée
+ Pour récuperer l'entrée:
  + En python lienIci
  + En C++ lienIci
  + En C lienIci
  + En Java lienIci

+ Exemple d'une entrée
```
6 9
1 2 3 4 5 6
1 A 2
1 B 2
2 C 3
3 C 2
3 A 2
3 A 4
4 B 5
5 A 5
5 B 6
  + la premiere ligne indique le nombre d'etats , et le nombre de transitions
  + la deuxieme ligne donne l'identifiant de chaque état
  + de la 3ème à la derniere ligne se trouve la table de transition , chaque ligne contient : 
  La source ,  le symbole de la transition , La destination
  
  **Bien entendu il s'agit d'un** ***exemple*** ! Il peut y avoir plus/moins d'états , ou de transitions
  
```

### Sortie
+ Pour chaque automate , votre programme doit afficher à l'ecran le résultat , qui sera soit INDETERMINISTE ou DETERMINISTE
A titre d'exemple , si votre programme récupère l'entrée donnée au dessus , la sortie devra ressembler à cela:

```
INDETERMINISTE

```
le résultat se termine avec un retour à la ligne
