# Recuperer les entrées en R

## Code 
Le code donné ci-dessous recupère pour vous les paramètres necessaires pour résoudre les problèmes

+ **Pour lire la ligne L de l'entrée standard:**
  ```R
  flux=file("stdin","r")
  suiteNombre=scan(file=flux, what=type, nline=L, quiet=TRUE)
  ```
  
  **example**: récuprérer deux lignes composée d'entiers:
  
  ```R  
  flux=file("stdin","r")
  L1=scan(file=flux, what=integer(), nline=1, quiet=TRUE)
  L2=scan(file=flux, what=integer(), nline=2, quiet=TRUE)
  ```
  
+ **Pour récupérer toutes les lignes:**
  ```R
con = file("stdin","r")
line = ""
while(TRUE)
{
	line <- scan(file=con,what=type,nline = 1 , quiet=TRUE)
	if (length(line) == 0)
	{
		break
	}
	cat(line)
	cat('\n')
}
  ```

**type** : définie le type de la donnée lu en entrée:

 + integer() pour des entiers (int)
 + character() pour des caractères (char)


  **Veillez à bien utiliser l'option suivante:**
  ```R
  quiet=TRUE
  ```
  ***Si vous ne l'utiliser pas, votre résultat sera faussé.***

