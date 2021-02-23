import java.util.HashMap;
import java.util.Set;

public class Collections {
    public static void main(String[] args) {
        HashMap<String, Integer> ids = new HashMap<>();
        ids.put("Alec Fortin", 5);
        ids.put("Bean Louise", 1);

        Set<String> keys = ids.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(ids.get(key));
        }

    }
}
