Branche : feature/statuts   |   Issue : #1

Ligne à ajouter dans src/AnalyseurLogs.java, sous le commentaire :
    analyses.put("statuts", new CompteurStatuts());

Commits conseillés (2 minimum) :
 1. Ajoute la classe CompteurStatuts
 2. Enregistre l'analyse statuts

Description de la PR :
## Quoi
Ajoute l'analyse « statuts » (nombre de requêtes par code HTTP, codes triés).

## Comment tester
java -cp out AnalyseurLogs logs/access.log statuts

Closes #1
