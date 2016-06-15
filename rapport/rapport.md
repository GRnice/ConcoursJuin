# Rapport du TER
## Sujet : Organisation d'un concours de programmation
## Encadrant : Arnaud Malapert www.i3s.unice.fr/~malapert/
### Année 2016 - Université de Sophia-Antipolis
### Etudiants : Mathias Ellapin - Rémy Giangrasso - Charles Heitzler


</br></br>

## Introduction:
Le sujet de notre ter est de réaliser un concours de programmation au sein de l'université sophia-antipolis,
afin de mener à bien notre tache principale , nous avons donc fait divers choix , et divers developpements.

Nous vous présenterons nos travaux , le déroulement du ter avec ses temps forts , nous vous présenterons également nos choix technologiques  , notre gestion du projet , et enfin nous terminerons sur une conclusion.

## Travail effectué

Notre travail se divise en plusieurs notions:

+ La rédaction des énoncés.
+ L'écriture des cas de tests , nécessaires pour vérifier la validité des codes des participants aux concours.
+ Le déploiement d'une infrastructure permettant aux organisateurs de concretiser un concours , et aux étudiants de soumettre leurs solutions.
+ La creation d'un site web , ainsi que le développement d'une procédure d'inscription au concours pour les étudiants.
+ Le developpement de nos propres solutions sous plusieurs langages résolvant nos differents problèmes afin de vérifier la validité des tests édités
+ Communication : présenter le concept aux étudiants

En choix technologique nous nous sommes appuyé sur deux infrastructures

Une dédiée au **support des énoncés** GitHub , et une autre qui nous a permis d'articuler le concours qui est une solution en Java nommée PC² http://pc2.ecs.csus.edu/ , développée par l'université d'état de Californie de Sacramento http://www.csus.edu/ , à travers son interface nous avons configuré les différents paramètres du concours.

## Les problèmes
Ajouter un problème au concours nécessite de passer par plusieurs étapes :
+ Inventer des énoncés , ou s'inspirer des problèmes des concours en ligne sur le web , tel que SPOJ.
+ Implementer une solution dans un langage , étudier sa complexité.
+ Définir les cas de tests , les cas limites par exemple.
+ Implementer le problème sous differents langages pour à la fois apprécier les differentes manières de concevoir une solution pour un problème P , et mettre à l'épreuve nos tests.
+ Enfin il ne reste plus que à ajouter le problème dans le logiciel PC2 avec les tests (écrits à la main) associés.

## Les Concours
Le ter s'est déroulé en deux temps , un premier temps où nous avons lancé un premier concours dans le cadre d'un TP noté dans l'UE Algo & Prog avec R http://www.i3s.unice.fr/~malapert/org/teaching/introR.html.

Puis dans un deuxième temps un vrai concours début juin où les étudiants motivés se sont inscrits via notre site vitrine.

Les liens menant aux deux concours :
+ concours du 18 avril https://github.com/GRnice/concoursProgram/blob/master/README.md
+ concours du 2 juin https://github.com/GRnice/ConcoursJuin/blob/master/MAIN.md

Avec le lien menant au site vitrine présentant le concours http://concours-prog-unice.890m.com

## Le logiciel PC2

PC2 peut etre utilisé par les professeurs dans le cadre d'un examen , pour cette raison nous avons fait une vidéo montrant comment l'installer et le parametrer.

Nous vous proposons de découvrir tout cela en vidéo :

+ video -> https://raw.githubusercontent.com/GRnice/ConcoursJuin/master/video-tuto.mp4

Ainsi que une documentation pour déployer la partie serveur et client.

+ Partie serveur https://github.com/GRnice/ConcoursJuin/blob/master/deploiement/serveur.md
+ Partie client https://github.com/GRnice/ConcoursJuin/blob/master/deploiement/client.md

## Gestion de projet

Au vue de la granularité des taches attribuées nous n'avons pas jugé utile l'emploi d'une plateforme telle que Jira , nous avons en revanche effectué un découpage des taches afin de pouvoir faire le point de manière hebdomadaire avec Mr Malapert afin de maximiser la communication et limiter les incompréhensions.

## Conclusion
Nous avons à travers ce projet apprécié son hétérogénéité , dans le sens où nous ne nous sommes pas cantonné dans un domaine précis mais bien dans plusieurs domaines , en allant du déploiement d'une infrastructure avec la collaboration du CRIPS à l'implementation des solutions dans plusieurs langages afin d'évaluer la complexité des problèmes posés aux étudiants.
Cela aura été l'occasion d'établir une percée dans le domaine de l'autoévaluation qui donnera peut etre envie aux professeursd'experimenter cette solution.
