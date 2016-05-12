# SmartStack

## Problème:
On souhaite implementer une structure de donnée semblable à une pile , à la différence que l'on souhaite pouvoir retirer des éléments à la base et au sommet

## Objectif:
La solution doit pouvoir :
+ Ajouter des entiers au sommet de la structure
+ Retirer des entiers au sommet et à la base de la structure.


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
11          # nombre d'instructions a éxécuter dans l'ordre
PUSH 4      # ajouter 4
PUSH 0      # ajouter 0
PUSH 9      # ajouter 9
PUSH 6      # ajouter 6
PUSH 12     # ajouter 12
PRINTSTACK  # afficher le contenu de la smartStack
POP         # retirer l'entier situé au sommet
POP         # retirer l'entier situé au sommet
PRINTSTACK  # afficher le contenu de la smartStack
BASEPOP     # retirer l'élément situé à la base
PRINTSTACK  # afficher le contenu de la smartStack
```
  + la premiere ligne indique le nombre d'instructions
  + ```PUSH x``` : Ajouter x sur la smartStack
  + ```POP``` : Retirer l'élément au sommet de la smartStack
  + ```BASEPOP``` : Retirer un élément situé sur la base de la smartStack
  + ```PRINTSTACK``` : Afficher à l'écran le contenu de la smartStack
  
  **Bien entendu il s'agit d'un** ***exemple*** ! Il peut y avoir plus/moins d'instructions !
  
### Sortie
+ La commande ```PRINTSTACK``` engendrera l'affichage du contenu de la smartStack sur l'écran.
+ 
A titre d'exemple , si votre programme récupère l'entrée donnée au dessus , la sortie devra ressembler à cela:

```
4 0 9 6 12
4 0 9
0 9

```
le résultat se termine avec un retour à la ligne

# Exercices:

+ **1) SSA1 - Exercice préliminaire , à faire sur feuille :**

Envoyez un code affichant simplement le contenu de la smartStack , l'affichage se terminera sur un retour à la ligne.

Voici les instructions à appliquer:

```
10          # nombre d'instructions a éxécuter dans l'ordre
PUSH 5      # ajouter 5
PUSH 0      # ajouter 0
PUSH 5      # ajouter 5
PUSH 6      # ajouter 6
PRINTSTACK  # afficher le contenu de la smartStack
POP         # retirer l'entier situé au sommet
POP         # retirer l'entier situé au sommet
BASEPOP     # retirer l'élément situé à la base
PUSH 5      # ajouter 5
PRINTSTACK  # afficher le contenu de la smartStack
```
<br/><br/><br/><br/>

+ 2) **SSA2 - Ecrivez un algorithme qui traitera les instructions données en entrée.**

+ Exemple
  + Entrée:
  ```
8           # nombre d'instructions a éxécuter dans l'ordre
PUSH 5      # ajouter 5
PUSH 0      # ajouter 0
PRINTSTACK
POP
PRINTSTACK
PUSH 9
BASEPOP
PRINSTACK
```
  + Sortie:
  ```
  5 0
  5
  9
  
  ```
