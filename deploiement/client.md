# Déploiement de PC2 coté client


## Pré-requis

PC2 est un logiciel développé en java , il vous faut donc installer à minima un JRE sur votre machine , Java 7 au minimum
et la partie serveur correctement déployée.

## Etapes

### **Télécharger** un zip du logiciel PC2

### **Dézipper** le dossier sur un dossier local aux machines du réseau.

### **Supprimer** des éléments du dossier pc2 client qui ne serviront pas au client

le dossier **bin** contiendra seulement les fichiers {*pc2env*,*pc2team*,*pc2ver*}.

### **Configurer** le fichier de configuration *pc2v9.ini*

Vous devez préciser l'adresse du serveur et le port utilisé.
Ouvrez le dossier pc2 où vous trouverez un fichier de configuration nommé *pc2v9.ini* , ouvrez le et inserez à la ligne ```server=adr_serveur?:port?``` l'adresse IP du serveur ainsi que le port utilisé par PC2 , exemple ```server=128.129.130.131:50002```

### **Editer** un fichier .sh pour faciliter le lancement du compte client , il contiendra ces trois lignes:
on admettra qu'il se nomme **pc2team.sh**
```shell
#!/bin/sh
PC2HOME=/chemin/absolu/du/dossier/client
$PC2HOME/bin/pc2team --ini $PC2HOME/pc2v9.ini &
```

### **Ajouter** au PATH de la machine le chemin absolu menant du dossier pc2 client
```shell
PATH=$PATH:/chemin/absolu/du/dossier/client
export PATH
```

### **Terminé !**


**L'étudiant** lors du concours créera un dossier dans son espace ,puis sur un terminal se positionnera dessus , et tapera ```pc2team.sh``` , l'interface se lancera et il pourra s'authentifier.
