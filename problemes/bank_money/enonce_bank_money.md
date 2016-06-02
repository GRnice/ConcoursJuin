# BANK MONEY

## Problème
Dans une liste de commandes d'un système de gestion de compte bancaire, vous allez recevoir des ordres de virement et allez devoir les effectuer.

## Objectif
L'objectif est donc d'**obéir** aux ordres qui sont donnés. Pour cela vous allez devoir gérer la création et la cloture de compte, ainsi que le débit et le crédit d'argent sur des comptes.

## Entrée & sortie:
Votre programme devra traiter les paramètres donnés en entrée, et fournir une réponse via une fonction d'affichage...

### Entrée

+ **Pour récuperer l'entrée:**

  + En [python](https://github.com/GRnice/ConcoursJuin/blob/master/IO/entreePython.md  "python")
  + En [C++](https://github.com/GRnice/ConcoursJuin/blob/master/IO/entreeCPP.md  "C++")
  + En [C](https://github.com/GRnice/ConcoursJuin/blob/master/IO/entreeC.md "C")
  + En [Java](https://github.com/GRnice/ConcoursJuin/blob/master/IO/entreeJava.md "Java")
  + En [R](https://github.com/GRnice/ConcoursJuin/blob/master/IO/entreeR.md "Java")

+ **Exemple d'une entrée**
  ```
  CREATECOUNT nom_compte
  CREDITCOUNT nom_compte 50
  DEBITECOUNT nom_compte 40 
  DELETECOUNT nom_compte
  ```

### Sortie

Si votre programme récupére l'entrée ci-dessus , votre programme affichera le résultat suivant:

```
  nom_compte:0
  nom_compte:50
  nom_compte:10
  nom_compte:null
  
```
**La sortie se terminera sur un retour à la ligne**

## Aspect technique:
Il existe en tout et pour tout 4 instructions qui sont les suivantes:
  + ```CREATECOUNT nom_compte```: creer un compte qui a pour nom ```nom_compte```
  + ```DELETECOUNT nom_compte```: supprimer le compte qui a pour nom ```nom_compte```
  + ```CREDITCOUNT nom_compte somme```: crédite ```somme``` au compte qui a pour nom ```nom_compte```
  + ```DEBITECOUNT nom_compte somme```: débite ```somme``` au compte qui a pour nom ```nom_compte```

Pour chaque opération, vous devez afficher le nom du compte sur lequel est réalisé une opération et son solde séparé par ```:```.

En cas de création de compte vous fixerez le solde du compte à 0.

En cas de suppréssion de compte vous fixerez le solde compte à ```null```.

# Exercices:

+ **1) BANK-1 , Résoudre le problème sur feuille**

Avec l'entrée donnée ci-dessous:
```
CREATECOUNT compte1
CREDITCOUNT compte1 50
CREATECOUNT compte2
CREDITCOUNT compte2 25
DEBITECOUNT compte1 5
```

Rédigez un code qui affichera la sortie engendrée par l'entrée.
**La sortie (l'affichage du résultat) , se terminera sur un retour à la ligne**

+ **2) BANK-2 , Implementer l'algorithme**

A présent implementez un programme qui traitera l'entrée et affichera à l'ecran le résultat.
**La sortie se terminera sur un retour à la ligne**

+ **3) BANK-3 , Approfondir**

Vous devez à present vérifier qu'un débit peut s'operer si et seulement si : (solde du compte - débit >= 0)
, si l'operation est impossible à réaliser , vous afficherez un simple ```ERROR```.
Modifier votre programme en conséquence..


