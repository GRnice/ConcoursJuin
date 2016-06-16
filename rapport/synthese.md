# Synthèse du TER
## Sujet : Organisation d'un concours de programmation
## Encadrant : Arnaud Malapert www.i3s.unice.fr/~malapert/
### Année 2016 - Université de Sophia-Antipolis
### Etudiants : Mathias Ellapin - Rémy Giangrasso - Charles Heitzler


## Sommaire
+ Remerciements
+ Introduction
+ Travail effectué
+ Les problèmes
+ Les concours
+ Le logiciel PC2
+ Gestion de projet
+ Conclusion

## Remerciements
Nous tenons tout d'abord à remercier notre encadrant mr Malapert et au CRIPS qui nous ont tout au long de ce projet donné leurs conseils ,les outils et leurs temps pour mener à bien ce projet.

## Introduction
Le sujet de notre ter est de réaliser un concours de programmation au sein de l'université Sophia Antipolis.
Afin de mener à bien notre tache principale , nous avons donc fait divers choix et divers développements.

Nous vous présenterons nos travaux , le déroulement du ter avec ses temps forts , nos choix technologiques  , notre gestion du projet et enfin nous terminerons sur une conclusion.

## Travail effectué

Notre travail se divise en plusieurs notions:

+ La rédaction des énoncés.
+ L'écriture des cas de tests , nécessaires pour vérifier la validité des codes des participants aux concours.
+ Le déploiement d'une infrastructure permettant aux organisateurs de concrétiser un concours et aux étudiants de soumettre leurs solutions.
+ La création d'un site web , ainsi que le développement d'une procédure d'inscription au concours pour les étudiants.
+ Le développement de nos propres solutions sous plusieurs langages résolvants nos différents problèmes afin de vérifier la validité des tests édités
+ Communication : présenter le concept aux étudiants

En choix technologique nous nous sommes appuyé sur deux infrastructures:

Une dédiée au **support des énoncés** GitHub et une autre qui nous a permis d'articuler le concours qui est une solution en Java nommée PC² http://pc2.ecs.csus.edu/ , développée par l'université d'état de Californie de Sacramento http://www.csus.edu/ . A travers son interface nous avons configuré les différents paramètres du concours.

## Les problèmes
Ajouter un problème au concours nécessite de passer par plusieurs étapes :
+ Inventer des énoncés, ou s'inspirer des problèmes des concours en ligne sur le web , tel que [SPOJ](http://www.spoj.com/ "spoj").
+ Implémenter une solution dans un langage , étudier sa complexité.
+ Définir les cas de tests , les cas limites par exemple.
+ Implémenter le problème sous différents langages pour à la fois apprécier les différentes manières de concevoir une solution pour un problème P et mettre à l'épreuve nos tests.
+ Enfin il ne reste plus que à ajouter le problème dans le logiciel PC2 avec les tests (écrits à la main) associés.

## Les Concours
Le ter s'est déroulé en deux temps :  un premier temps où nous avons lancé un premier concours dans le cadre d'un TP noté dans l'UE
[Algo & Prog avec R](http://www.i3s.unice.fr/~malapert/org/teaching/introR.html "Algo & Prog avec R") puis dans un deuxième temps un vrai concours début juin où les étudiants motivés se sont inscrits via notre site vitrine.

Les liens menant aux deux concours :

+ [concours du 18 avril](https://github.com/GRnice/concoursProgram/blob/master/README.md "concours du 18 avril") 
+ [concours du 2 juin](https://github.com/GRnice/concoursProgram/blob/master/README.md "concours du 2 juin")

Avec ce [lien](http://concours-prog-unice.890m.com "lien 2 juin") menant au site vitrine présentant le concours du 2 juin
, vous pouvez accéder aux énoncés , au tableau des scores des équipes et enfin au podium.

## Le logiciel PC2

PC2 peut être utilisé par les professeurs dans le cadre d'un examen. Pour cette raison nous avons fait des vidéos montrant comment l'installer et le paramétrer.

Nous vous proposons de découvrir tout cela en vidéo :
+  [déploiement coté serveur](https://raw.githubusercontent.com/GRnice/ConcoursJuin/master/serveur.mp4 "movie")
+  [déploiement coté client](https://raw.githubusercontent.com/GRnice/ConcoursJuin/master/client.mp4 "movie")
+  [exemple avec un mini-concours](https://raw.githubusercontent.com/GRnice/ConcoursJuin/master/video-tuto.mp4 "movie")

Ainsi qu'une documentation pour déployer la partie serveur et client:
+ Partie [serveur](https://github.com/GRnice/ConcoursJuin/blob/master/deploiement/serveur.md "serveur")
+ Partie [client](https://github.com/GRnice/ConcoursJuin/blob/master/deploiement/client.md "client")

## Gestion de projet

Au vue de la granularité des taches attribuées nous n'avons pas jugé utile l'emploi d'une plateforme telle que Jira , nous avons en revanche effectué un découpage des taches de telle sorte que nous puissions faire le point une fois par semaine avec Mr Malapert afin de maximiser la communication et limiter les incompréhensions sur la feuille de route.

## Conclusion
Nous avons à travers ce projet apprécié son hétérogénéité dans le sens où nous ne nous sommes pas cantonné dans un domaine précis mais bien dans plusieurs domaines en allant du déploiement d'une infrastructure avec la collaboration du CRIPS à l'implémentation des solutions dans plusieurs langages afin d'évaluer la complexité des problèmes posés aux étudiants.
Cela aura été l'occasion d'établir une percée dans le domaine de l'autoévaluation qui donnera peut-être envie aux professeurs d'expérimenter cette solution.
