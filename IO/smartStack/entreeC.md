# Recuperer les entrées en C pour le probleme SmartStack

## Code
Le code donné ci-dessous recupère pour vous les paramètres necessaires pour résoudre les problèmes

```
# Recuperer les entrées en C++

## Code
Le code donné ci-dessous recupère pour vous les paramètres necessaires pour résoudre les problèmes

```C
#include <stdio.h>
#include <stdlib.h>

int main(void)
{
  char instruction[10];
  int val = 0;
  
  while(fscanf(stdin , "%s %d" , instruction , &val) > 0)
  {
    // instruction contient BASEPOP , PUSH , POP , ou PRINTSTACK
    // val doit etre utilisé uniquement si instruction vaut PUSH
    // puisque val represente la valeur entiere à ajouter à la smartStack
  }
}
```

Inserez le dans votre code , le vecteur ```vect``` est un tableau où chaque cellule contient une ligne de l'entrée , representée par une string.

## Exploitation

Pour afficher toutes les lignes du vecteur:

```
for (int i = 0 ; i < vect.size() ; i++)
	{
		cout << vect.at(i) << endl;
	}
```

```

Inserez le dans votre code , le vecteur ```vect``` est un tableau où chaque cellule contient une ligne de l'entrée , representée par une string.

## Exploitation

Pour afficher toutes les lignes du vecteur:

```
for (int i = 0 ; i < vect.size() ; i++)
	{
		cout << vect.at(i) << endl;
	}
```
