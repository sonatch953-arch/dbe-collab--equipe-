Branche : feature/top   |   Issue : #2

Ligne à ajouter dans src/AnalyseurLogs.java, sous le commentaire :
    analyses.put("top", new TopEndpoints());

Commits conseillés (2 minimum) :
 1. Ajoute la classe TopEndpoints
 2. Enregistre l'analyse top

Description de la PR :
## Quoi
Ajoute l'analyse « top » (3 endpoints les plus appelés, sans ?page=).

## Comment tester
java -cp out AnalyseurLogs logs/access.log top

Closes #2
