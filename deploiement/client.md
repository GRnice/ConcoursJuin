# Déploiement de PC2 coté client


## Pré-requis

PC2 est un logiciel développé en java , il vous faut donc installer à minima un JRE sur votre machine , Java 7 au minimum
et la partie serveur correctement déployée.

## Etapes

### **Déplacer** un sous-ensemble du dossier pc2 sur les machines de la fac , c'est à dire que le dossier client pc2
contiendra dans son dossier *bin* {*pc2env*,*pc2team*,*pc2v9.ini*,*pc2ver*}
et dans son dossier *lib* {*activation.jar*,*mailapi.jar*,*mclb.jar*,*pc2.jar*,*smtp.jar*}

### **Définir** le fichier de configuration *pc2v9.ini* , vous devez préciser l'adresse du serveur et le port utilisé

Ouvrez le dossier pc2 où vous trouverez un fichier de configuration nommé *pc2v9.ini* , ouvrez le et inserez à la ligne ```server=adr_serveur?:port?``` l'adresse IP du serveur ainsi que le port utilisé par PC2 , exemple ```server=128.129.130.131:50002```

### **Ajouter** au PATH de la machine le chemin absolu menant au dossier bin du dossier pc2 client

### **Terminé !**


**L'étudiant** lors du concours créera un dossier ,puis sur un terminal se positionnera dessus , et tapera ```pc2team&``` , l'interface se lancera et il pourra s'authentifier.
