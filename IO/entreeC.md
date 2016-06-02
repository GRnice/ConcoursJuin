# Recuperer les entrées en C

## Code

```C
#include <stdio.h>
#include <stdlib.h>

int main(void) {
  unsigned int n=1, m;
  while(n) {
    if ( scanf("%d", &n) == EOF) {
      n=0;
    }
    else {
      printf("%d\n", n);
      while(n--) {
        scanf("%d", &m);
        printf("%d ", m);
      }
      printf("\n");
	}
  }
  return EXIT_SUCCESS;
}
```
