# Recuperer les entrées en Python

## Code
Le code donné ci-dessous recupère pour vous les paramètres necessaires pour résoudre les problèmes

```
string input_line;
std::vector<std::string> vect;

while (cin)
{
  getline(cin, input_line);
  vect.push_back(input_line);
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
