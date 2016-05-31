# PathInATree

## Probleme
On vous donne un arbre avec N noeuds ayant des noeuds numérotés de 1 à N- 1 . Chaque arête possède une valeur entière qui lui est attribuée (toutes les valeurs sont fixées à 1) , cette valeur représente la distance entre deux noeuds .

## Objectif

Nous vous demanderons d'évaluer des instructions de la forme suivante :

    DIST x y : demander la distance entre le noeud x et le noeud y
    ou
    KTH x y k : demander le k-ième noeud sur le chemin allant du noeud x au noeud y


## Exemple

```
6 // 6 noeuds
1 2 // sommet 1 connecté au sommet 2
2 4 // sommet 2 connecté au sommet 4
2 5 // ...
1 3 // ...
3 6 // ...
DIST 4 6
KTH 4 6 4
DONE // indique qu'il n'y a plus rien à faire
```

Le chemin entre le sommet 4 et le sommet 6 est : 4 -> 2 -> 1 -> 3 -> 6
DIST 4 6 : la réponse est : 4 (1 + 1 + 1 + 1 = 4)
KTH 4 6 4 : la réponse est 3 (le quatrième sommet du chemin allant du sommet 4 au sommet 6 est le sommet 3)

## Entrée & sortie:

Votre programme devra traiter les paramètres donnés en entrée , et fournir un résultat via une fonction d'affichage...

### Entrée
+ Pour récuperer l'entrée:
  + En [python](https://github.com/GRnice/ConcoursJuin/blob/master/IO/entreePython.md  "python")
  + En [C++](https://github.com/GRnice/ConcoursJuin/blob/master/IO/entreeCPP.md  "C++")
  + En [C](https://github.com/GRnice/ConcoursJuin/blob/master/IO/entreeC.md "C")
  + En [Java](https://github.com/GRnice/ConcoursJuin/blob/master/IO/entreeJava.md "Java")
  + En [R](https://github.com/GRnice/ConcoursJuin/blob/master/IO/entreeR.md "Java")

+ Exemple d'une entrée
```
6 # les 6 lignes en dessous sont dediées à la construction de l'arbre , celles plus en bas seront des instructions {DIST KTH DONE}
1 2  # noeud 1 connecté au noeud 2 , le pere est le membre de gauche , dans ce cas 1 est l'ancetre de 2
2 3  # noeud 2 connecté au noeud 3
3 4  # ...
1 5  # ...
5 6  # ...
DIST 4 6 # afficher la plus courte distance entre ces deux noeuds
DIST 1 2 # afficher la plus courte distance entre ces deux noeuds
KTH 4 6 2 # afficher le numero du 2ème sommet du chemin allant du sommet 4 vers le sommet 6
```
  
  **Bien entendu il s'agit d'un** ***exemple*** ! Il peut y avoir plus/moins d'instructions et plus/moins de noeuds !
  
### Sortie
A titre d'exemple , si votre programme récupère l'entrée donnée au dessus , la sortie devra ressembler à cela:
```
5
1
3

```
**La sortie se terminera toujours par un unique retour à la ligne**

# Exercices

+ **1) PIF-1 - Exercice préliminaire sur feuille**


Envoyez un code affichant le résultat des deux instructions en fonction de la composition de l'arbre donné ci-dessous , l'affichage se terminera sur un retour à la ligne.

Voici les instructions:

```
6 # nombre de noeuds
1 2  # noeud 1 connecté au noeud 2 , le pere est le membre de gauche , dans ce cas 1 est l'ancetre de 2
2 3  # noeud 2 connecté au noeud 3
3 4  # ...
1 5  # ...
5 6  # ...
DIST 4 6 # afficher la plus courte distance entre ces deux noeuds
KTH 4 6 2 # afficher le numero du 2ème sommet du chemin allant du sommet 4 vers le sommet 6
```

+ **2) PIF-2 - Coder l'algorithme**

Ecrivez un code qui appliquera les instructions passés en paramètre et affichera un résultat correct.

Pensez aux cas extremes...

**La sortie se terminera sur un retour à la ligne**
