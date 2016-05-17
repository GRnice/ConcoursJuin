# QTREE

## Probleme
On vous donne un arbre avec N noeuds , et les bords numérotés 1 , 2, 3 ... N- 1 . Chaque arête possède une valeur entière qui lui est attribué (toutes les valeurs sont fixées à 1) , ce qui représente sa longueur.

## Objectif

Nous vous demanderons d'évaluer quelques instructions de la forme suivante :

    DIST a b : demander la distance entre le noeud d'un noeud et b
    ou
    KTH a b k : demander le noeud k-ième sur le chemin du noeud d'un noeud à b


## Exemple

N = 6
1 2 // sommet 1 connecté au sommet 2
2 4 // sommet 2 connecté au sommet 4
2 5 // ...
1 3 // ...
3 6 // ...

Le chemin entre le sommet 4 et le sommet 6 est : 4 -> 2 -> 1 -> 3 -> 6
DIST 4 6 : la réponse est : 4 (1 + 1 + 1 + 1 = 4)
KTH 4 6 4 : la réponse est 3 (le quatrième sommet du chemin allant du sommet 4 au sommet 6 est le sommet 3)

## Entrée & Sortie

