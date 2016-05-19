# Entrées en C pour le problème Bank_money

## Code
Le code donné ci-dessous recupère pour vous les paramètres necessaires pour résoudre le problème Bank_money

```C
#include <stdio.h>
#include <stdlib.h>

int main(void){
	char s1[10];
	char s2[10];
	int inte=-1;
	while(fscanf(stdin,"%s %s %d",s1,s2,&inte) > 0){
		if(inte<0){
			printf("%s %s\n",s1,s2);
		}
		else{
		printf("%s %s %d\n",s1,s2,inte);
		}
		inte=-1;
	}
	return 0;
}
```

Inserez le dans votre code pour récuperer les entrées.





