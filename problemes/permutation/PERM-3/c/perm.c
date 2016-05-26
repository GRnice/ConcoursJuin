#include <stdio.h>
#include <stdlib.h>


int permutation(int liste[], int permut[], int taille){
	int i=0;
	while(i < taille){
		if(  ((i+1) != permut[liste[i]-1]) || (permut[i] != liste[i]) ) {
		//	printf("i: %d, p: %d, l: %d \n",(i+1), permut[liste[i]-1], liste[i] );
			return 0;
		}
		i++;
	}
	return 1;
}

int* fx(int permut[], int taille){
	int i=0;
	for(i; i< taille; i++){
		permut[i]=(permut[i]-3)/2;
	}
	return permut;
}

int main(int argc, char **argv)
{
    int k;
	int taille = 1;  // TAILLE  A 1  ??
	int val;
	char caractere;

   while (scanf("%d%c", &val, &caractere) > 0 && caractere != '\n' && caractere != '\r') {
    	  //  printf("caractere: %d\n", caractere );
        taille++;
    } 

    //printf("taille: %d\n", taille );

    int liste[taille];
    int permut[taille];

    rewind(stdin);    

    int j=0;
    while (scanf("%d", &k) == 1) {
    	if(j < taille){
        	liste[j]=k;
     	}
     	else{
     	 	permut[j-taille]=k;
     	 }
        j++;
     }

    int c=0;

    // for(c;c<taille;c++){
    // 	printf("per: %d\n", liste[c] );
    // }

    int *permutfx= fx(permut,taille);
    int t = permutation(liste, permut, taille);
    // printf("t: %d\n", t);
    if(t){
    	printf("TRUE\n");
 	}
 	else{
 		printf("FALSE\n");
 	}
	return 0;
}