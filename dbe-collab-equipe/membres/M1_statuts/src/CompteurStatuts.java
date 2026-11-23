import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CompteurStatuts implements Analyse {
    public String nom() { return "statuts"; }

    public String executer(List<String> lignes) {
        Map<String, Integer> m = new TreeMap<>();
        for (String l : lignes) {
            m.merge(l.split(" ")[8], 1, Integer::sum);
        }
        StringBuilder sb = new StringBuilder();
        m.forEach((code, n) -> sb.append(code).append(" : ").append(n).append("\n"));
        return sb.toString();
    }
}
