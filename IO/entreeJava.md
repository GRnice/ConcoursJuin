# Recuperer les entrées en Java

## Code
Le code donné ci-dessous recupère pour vous les paramètres necessaires pour résoudre les problèmes

```Java
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StdinExtract
{
	public ArrayList<String> entrees;
	
	public StdinExtract()
	{
	  this.entrees = new ArrayList<>();
	}
	
	public ArrayList<String> getEntrees()
	{
	
	try
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
			
		while((input=br.readLine())!=null)
		{
			this.entrees.add(input);
		}
			
	}
	catch(IOException io)
	{
		io.printStackTrace();
	}
	
	return this.entrees;
  }
  
}
```

Inserez la classe dans votre code ,  la méthode getEntrees() retourne une ArrayList de Strings , où chaque String represente une ligne de l'entrée.

## Exploitation

Pour afficher toutes les lignes du vecteur:

```
StdinExtract stdinentre = new StdinExtract();
ArrayList<String> entrees = stdinentre.getEntrees();
for (int i = 0 ; i < entrees.size() ; i++)
{
	System.out.println(entrees.get(i).toString());
}
```



