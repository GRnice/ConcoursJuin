# Recuperer les entrées en C

## Code

```C
#include <stdio.h>
#include <stdlib.h>
int main (void)
{
  char buf[256];
  int i = 0;
  while (fgets (buf, sizeof(buf), stdin)) {
    // line est la ième ligne de l'entrée
    i++;
  }
  if (ferror(stdin)) {
    return 1;
  }
  return 0;
}
```
