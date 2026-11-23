# AnalyseurLogs

Outil Java qui analyse un journal d'accès d'API (statuts, top endpoints, détection de force brute).

## Usage
    javac -encoding UTF-8 -d out src/*.java
    java -cp out GenerateurLogs <equipe> 2000 > logs/access.log
    java -cp out AnalyseurLogs logs/access.log <statuts|top|bruteforce>

## Équipe
M1, M2, M3
