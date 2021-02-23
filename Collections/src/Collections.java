import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Collections {
    public static void main(String[] args) {

        Person p = new Person("email@email.com", "Fortin");
        Position pos1 = new Position(10,10);
        p.position = pos1;

        Person q = new Person("email@email.com", "Fortin");
        Position pos2 = new Position(10,10);
        q.position = pos2;

        HashSet<Person> people = new HashSet<Person>();

        people.add(p);
        people.add(q);

        Person newPerson = new Person("email@email.com", "Fortin");
        Position newPos = new Position(10,10);
        q.position = newPos;

        System.out.println(people.contains(p));

        HashMap<String, Person> peeps = new HashMap<String, Person>();
        peeps.put("email@email.com", newPerson);
        System.out.println("HashMap: " + peeps.containsKey("email@email.com"));




    }
}
