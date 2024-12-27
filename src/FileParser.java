import java.io.*;
import java.util.*;

public class FileParser {
    public static List<Student> parseStudents(String filePath) throws IOException {
        List<Student> students = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            String name = parts[0];
            int age = Integer.parseInt(parts[1]);
            String surname = parts[2];
            boolean gender = Boolean.parseBoolean(parts[3]);
            Student student = new Student(name, age, surname, gender);

            for (int i = 4; i < parts.length; i++) {
                student.addGrade(Integer.parseInt(parts[i]));
            }
            students.add(student);
        }
        reader.close();
        return students;
    }

    public static List<Teacher> parseTeachers(String filePath) throws IOException {
        List<Teacher> teachers = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            String name = parts[0];
            int age = Integer.parseInt(parts[1]);
            String surname = parts[2];
            boolean gender = Boolean.parseBoolean(parts[3]);
            String subject = parts[4];
            int experience = Integer.parseInt(parts[5]);
            int salary = Integer.parseInt(parts[6]);

            Teacher teacher = new Teacher(name, age, surname, gender, subject, experience, salary);
            teachers.add(teacher);
        }
        reader.close();
        return teachers;
    }
}
