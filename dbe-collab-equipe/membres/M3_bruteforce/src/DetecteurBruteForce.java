import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DetecteurBruteForce implements Analyse {
    public String nom() { return "bruteforce"; }

    public String executer(List<String> lignes) {
        Map<String, Integer> m = new HashMap<>();
        for (String l : lignes) {
            String[] p = l.split(" ");
            if (p[6].equals("/api/auth/login") && p[8].equals("401")) {
                m.merge(p[0], 1, Integer::sum);
            }
        }
        StringBuilder sb = new StringBuilder();
        m.forEach((ip, n) -> {
            if (n > 20) sb.append("ALERTE ").append(ip).append(" : ").append(n).append(" échecs\n");
        });
        return sb.length() == 0 ? "Aucune IP suspecte\n" : sb.toString();
    }
}
