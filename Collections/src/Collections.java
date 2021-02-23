
public class Collections {
    public static void main(String[] args) {
        Item<String> item = new Item<>();
        item.setX("hello");

        Item<Person> person = new Item<>();
        Person p = new Person("email@email.com", "hello");
        person.setX(p);

        Person p2 = person.getX();
    }
}
