import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/** Usage : java -cp out AnalyseurLogs <fichier.log> <analyse> */
public class AnalyseurLogs {
    public static void main(String[] args) throws IOException {
        Map<String, Analyse> analyses = new LinkedHashMap<>();
        // Chaque membre enregistre son analyse ici (une ligne par analyse)

        if (args.length != 2 || !analyses.containsKey(args[1])) {
            System.err.println("Usage : java -cp out AnalyseurLogs <fichier.log> <analyse>");
            System.err.println("Analyses disponibles : " + analyses.keySet());
            System.exit(1);
        }
        List<String> lignes = Files.readAllLines(Paths.get(args[0]));
        System.out.print(analyses.get(args[1]).executer(lignes));
    }
}
