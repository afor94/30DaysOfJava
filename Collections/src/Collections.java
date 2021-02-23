import java.util.HashMap;
import java.util.Set;

public class Collections {
    public static void main(String[] args) {
        Person p = new Person("email@email.com", "Fortin");
        Person q = new Person("email@email.com", "Fortin");
        Position pos1 = new Position(10,10);
        p.position = pos1;
        Position pos2 = new Position(10,10);
        q.position = pos2;

        System.out.println(p.equals(q));
        System.out.println(q.hashCode());
        System.out.println(p.hashCode());


    }
}
