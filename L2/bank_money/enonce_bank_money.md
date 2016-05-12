# BANK MONEY

## Problème
Dans une liste de commande d'un système de gestion de compte bancaire, vous allez recevoir des ordres de virement et aller devoir les effectuer.

## Objectif
L'objectif est donc d'**obéir** aux ordres qui sont donnés. Pour cela vous allez devoir gérer la création et cloture de compte, ainsi que le débit et le crédit d'argent sur des comptes.

## Entrée & sortie:
Votre programme devra traiter les paramètres donnés en entrée, et fournir une solution via une fonction d'affichage...

### Entrée

+ **Pour récuperer l'entrée:**

  + en Python lien Ici (pas encore bon)

+ **Exemple d'une entrée**
  ```
  CREATECOUNT nom_compte
  CREDITCOUNT nom_compte 50
  DEBITECOUNT nom_compte 40 
  DELETECOUNT nom_compte
  ```

### Sortie

+ Pour chaque instruction vous agirez en fonction.

```
  nom_compte:0
  nom_compte:50
  nom_compte:10
  nom_compte:null
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


