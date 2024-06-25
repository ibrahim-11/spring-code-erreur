#  Projet de test

Ce projet est un test d'evaluation de competence techniques.


## Run

1/ Installer la JDK 17 [correctement](https://www.youtube.com/watch?v=1ZbHHLobt8A)

2/ Ouvrir le projet avec [Intellij](https://www.jetbrains.com/fr-fr/idea/download/#section=windows)

3/ Définir un RUN configuration avec maven: `spring-boot:run`

4/ Run le projet dans intellij




## Technologies

- JDK 17
- Spring 2.7.7
- Maven
- Data JPA
- Datbase H2 
- Spring Test
- [Lombok](###Lombok)






### Lombok

[Lien utile](https://www.baeldung.com/intro-to-project-lombok)

Lombok est un outil permettant de générer automatiquement certaines fonctionnalités de java/spring à la compilation.

Il permet, en autre, de générer les Getter, Setter, différents types de constructeurs, des toString, etc...

Cela permet d'alléger les class Java pour faciliter leur lecture, et également de ne pas à avoir à modifier ces fonction.

#### model

Regroupe les Entités / Model / DAO de l'application.




#### repository

Regroupe les repositories de l'application



#### service

Regroupe les services de l'application en usant du *couplage faible*. C'est à dire que les services sont définis en interfaces puis implémentés.