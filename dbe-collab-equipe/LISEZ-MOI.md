# Mode d'emploi (dossier d'aide, ne pas mettre dans le dépôt)

1. M1 crée le dépôt public dbe-collab-<equipe> et y met : src/, .github/, README.md
   (Add file > Upload files). Ajouter ensuite collaborateurs, variable EQUIPE, règle de protection de main.
2. Créer les 3 issues (label feature) et le tableau Projects.
3. Chaque membre : créer sa branche feature/<analyse>, ajouter le fichier de son dossier membres/,
   modifier AnalyseurLogs.java (1 ligne), faire 2 commits, ouvrir la PR (texte dans PR_et_ligne.md).
4. Revue croisée : M1 relit M2, M2 relit M3, M3 relit M1 (Request changes puis Approve).
5. Fusion dans l'ordre M1, M2, M3 ; résoudre le conflit en gardant toutes les lignes put.
6. M1 : release v1.0 avec notes générées automatiquement.
