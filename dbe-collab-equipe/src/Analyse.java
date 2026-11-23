import java.util.List;

/** Une analyse appliquée aux lignes d'un journal d'accès. */
public interface Analyse {
    String nom();
    String executer(List<String> lignes);
}
