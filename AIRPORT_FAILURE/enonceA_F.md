# AIRPORT_FAILURE

## Problème:
Lors d'un appel d'offre , votre solution a été retenue ; il s'agit de développer une solution capable de gerer le trafic aerien lorsqu'un
imprevu arrive , dans le cas présent , la fermeture innopinée d'un aeroport dû aux mauvaises conditions météo.
Ce qui entraine automatiquement une perturbation du trafic.

## Objectif:
L'objectif est donc de **rediriger** les avions affectés par la fermeture de leur destination sur l'aéroport le plus proche de leur destination.

## Aspects techniques:
+ Pour récuperer les paramètres en entrée:

  + en Python lienIci
  + en C++ lienIci
  + en C lienIci
  + en Java lienIci
  
  
# Exercices:

1) Résoudre le problème énoncé au dessus en tenant compte des paramètres donnés en entrée.

+ **Exemple d'une entrée**
  ```
  8
  A 1 2 B C
  B 3 5 A D
  C 2 8 A D
  D 5 11 C B E F
  E 2 15 D
  F 5 18 D G H
  G 5 22 F
  H 5 25 F
  3
  AF754 0 0 A
  AF755 0 0 A
  AF756 0 0 A
  FAIL A B C
  ```
  + la premiere ligne donne le nombre d'aeroports,
  + de la 2ème à la 9ème ligne se trouve le listing des aéroports où
  chaque ligne contient : le nom de l'aeroport , sa position en x , sa position en y , puis une série de noms d'aéroports à proximité
  + la 10ème ligne donne le nombre d'avions en vol.
  + de la 11ème à la 13ème ligne se trouve le listing des avions où chaque ligne contient : le nom de l'avion , sa position en x , sa position en y , sa destination
  + la derniere ligne est une liste d'aéroport fermés
  
  **Bien entendu il s'agit d'un** ***exemple*** ! Il peut y avoir plus/moins d'aeroports , ou d'avions
