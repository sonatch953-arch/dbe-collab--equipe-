Branche : feature/bruteforce   |   Issue : #3

Ligne à ajouter dans src/AnalyseurLogs.java, sous le commentaire :
    analyses.put("bruteforce", new DetecteurBruteForce());

Commits conseillés (2 minimum) :
 1. Ajoute la classe DetecteurBruteForce
 2. Enregistre l'analyse bruteforce

Description de la PR :
## Quoi
Ajoute la détection de force brute (IP avec plus de 20 échecs 401 sur /api/auth/login).

## Comment tester
java -cp out AnalyseurLogs logs/access.log bruteforce

Closes #3
