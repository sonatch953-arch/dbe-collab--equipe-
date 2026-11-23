import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopEndpoints implements Analyse {
    public String nom() { return "top"; }

    public String executer(List<String> lignes) {
        Map<String, Integer> m = new HashMap<>();
        for (String l : lignes) {
            String chemin = l.split(" ")[6].split("\\?")[0];
            m.merge(chemin, 1, Integer::sum);
        }
        StringBuilder sb = new StringBuilder();
        m.entrySet().stream()
            .sorted((a, b) -> b.getValue() - a.getValue())
            .limit(3)
            .forEach(e -> sb.append(e.getValue()).append(" ").append(e.getKey()).append("\n"));
        return sb.toString();
    }
}
