package lab2.problem5;

import java.util.ArrayList;
import java.util.List;

public class PersonRegistry {
    private List<Person> people;

    public PersonRegistry() {
        people = new ArrayList<>();
    }

    public void addPerson(Person p) {
        people.add(p);
    }

    public void removePerson(Person p) {
        people.remove(p);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("--- Person Registry ---\n");
        for (Person p : people) {
            sb.append(p.toString()).append("\n");
        }
        sb.append("-----------------------");
        return sb.toString();
    }
}