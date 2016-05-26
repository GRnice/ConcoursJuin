# Recuperer les entrées en C

## Code

```C
#include <stdio.h>
#include <stdlib.h>

int main (void)
{
  char buf[256]; // une ligne n'excedera jamais 256 caracteres.
  int i = 0;
  while (fgets (buf, sizeof(buf), stdin))
  {
    // buf contient la ième ligne
    i++;
  }
  if (ferror(stdin)) {
    return 1;
  }
  return 0;
}
```
