#Déploiement de PC2 sur serveur

## Fonctionnement

Pc2 est une solution permettant de gerer le bon déroulement d'un concours de programmation , à travers son interface vous
pourrez ajouter des problemes , définir les langages autorisés, et définir des comptes pour differents usages.

## Pré-requis

PC2 est un logiciel développé en java , il vous faut donc installer à minima un JRE sur votre machine , Java 7 au minimum

## Etapes

### **Télécharger** PC2

A cette adresse http://pc2.ecs.csus.edu/secret.0216.html

### **Dézipper** le où vous le souhaitez

### **Définir** le fichier de configuration *pc2v9.ini*

Ouvrez le dossier pc2 où vous trouverez un fichier de configuration nommé *pc2v9.ini* , ouvrez le et inserer à la ligne ```server=localhost:50002``` l'adresse IP du serveur ainsi que le port utilisé par PC2 , exemple ```server=128.129.130.131:50002```

### **Ajouter** au PATH de la machine le chemin absolu menant au dossier bin du dossier pc2

### **Terminé !**

A présent le dispositif est posé , si vous souhaitez créer un concours , il est necessaire de créer un dossier car lors de lancement du concours TOUS les fichiers log seront écrits dans le dossier d'où vous avez instancié le concours .

**Creez** un dossier , sur un terminal positionnez vous dessus , et tapez ```pc2server&``` , le site est lancé , le login et le mot de passe sont par défaut ```site1``` , vous aurez par la suite un autre mot de passe à définir.