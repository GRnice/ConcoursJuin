# Recuperer les entrées en C pour le problème SmartStack

## Code
Le code donné ci-dessous recupère pour vous les paramètres necessaires pour résoudre le problème SmartStack

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

Inserez le dans votre code.
