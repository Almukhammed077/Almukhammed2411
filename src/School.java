import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Person> members;

    public School() {
        this.members = new ArrayList<>();
    }
    public List<Person> getMembers() {
        return members;
    }

    public void addMember(Person person) {
         if (person != null) {
            members.add(person);
        } else {
            System.out.println("Cannot add a null member.");
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("School Members:\n");
        for (Person member : members) {
            result.append(member.toString()).append("\n");
        }
        return result.toString();
    }
}
