# Recuperer les entrées en Python

## Code 
Le code donné ci-dessous recupère pour vous les paramètres necessaires pour résoudre les problèmes
 
```python
import sys
data = sys.stdin.readlines()
```

Inserez le dans votre code , la variable ```data``` est un tableau de Strings.

**Note**: /!\ Prenez garde aux caracteres de fin de ligne. /!\

Pour vous débarrasser des caracteres invisibles contenus dans chaque ligne de ```data``` , procedez ainsi.

```Python
# avant la boucle , data contient des caracteres invisibles (caractère de saut de ligne par exemple)
for i in range(len(data)):
 data[i] = data[i].rstrip()

# apres cette boucle , data contient uniquement des caracteres visibles

```
