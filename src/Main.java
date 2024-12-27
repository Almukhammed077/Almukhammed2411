  /*public class Main {
    public static void main(String[] args){
    Person person = new Person("Almukhammed", 18, "Amantay", true);
        System.out.println(person);
    }
}*/
    /* public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alida", 18, "Mirmagalieva", false);
        student.addGrade(85);
        student.addGrade(90);
        student.addGrade(78);
        System.out.println(student);
        System.out.println("GPA: " + student.calculateGPA());
        Teacher teacher = new Teacher("Saken", 45, "Birgeldi", true, "Mathematics", 20, 50000);
        System.out.println(teacher);
        teacher.giveRais
        System.out.println("New Salary: " + teacher.getSalary());
    }
}*/
/*public class Main {
    public static void main(String[] args) {
        School school = new School();
        Student student1 = new Student("Alida", 18, "Mirmagalieva", false);
        student1.addGrade(90);
        student1.addGrade(85);

        Student student2 = new Student("Aizat", 22, "Kydyrkhan", true);
        student2.addGrade(70);
        student2.addGrade(75);

        Teacher teacher1 = new Teacher("Saken", 45, "Birgeldi", true, "Mathematics", 20, 50000);
        Teacher teacher2 = new Teacher("Diana", 38, "Aralbaeva", false, "Physics", 15, 60000);
        school.addMember(student1);
        school.addMember(student2);
        school.addMember(teacher1);
        school.addMember(teacher2);
        System.out.println(school);
    }
}*/
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            List<Student> students = FileParser.parseStudents("students.txt");
            List<Teacher> teachers = FileParser.parseTeachers("teachers.txt");

            School school = new School();

            for (Student student : students) {
                school.addMember(student);
            }
            for (Teacher teacher : teachers) {
                school.addMember(teacher);
            }

            System.out.println("Testing GPA Calculation:");
            for (Student student : students) {
                System.out.println(student.getName() + "'s GPA: " + student.calculateGPA());
            }

            System.out.println("\nTesting Raise for Teachers with >10 Years Experience:");
            for (Teacher teacher : teachers) {
                if (teacher.getYearsOfExperience() > 10) {
                    System.out.println("Giving raise to " + teacher.getName());
                    teacher.giveRaise(10);
                }
            }

            System.out.println("\nSorting School Members by Surname:");
            school.getMembers().sort(Comparator.comparing(Person::getSurname));

            System.out.println(school);

        } catch (IOException e) {
            System.err.println("Error reading files: " + e.getMessage());
        }
    }
}
