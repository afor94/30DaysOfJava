
public class Collections {
    public static void main(String[] args) {
        Pair<Person, Person> person = new Pair<>();
        Person p = new Person("email@email.com", "hello");
        person.setX(p);
        person.setY(p);

        Person p2 = person.getX();
    }
}
