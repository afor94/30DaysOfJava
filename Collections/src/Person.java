import java.util.Objects;

public class Person {
    String email;
    String ln;
    Position position;

    Person(String email, String ln){
        this.email=email;
        this.ln = ln;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(email, person.email) && Objects.equals(ln, person.ln) && Objects.equals(position, person.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, ln, position);
    }
}
