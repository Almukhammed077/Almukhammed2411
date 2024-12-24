public class Students extends Person {
    private int studentID;
    private List<Integer> grades;

    public Students(String name, String surname, int age, boolean gender) {
        super(name, surname, age, gender);
        this.studentID = (int) (Math.random() * 9000) + 1000; 
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        } else {
            throw new IllegalArgumentException("Grade must be between 0 and 100.");
        }
    }

    public double calculateGPA() {
        return grades.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    @Override
    public String toString() {
        return super.toString() + " I am a student with ID " + studentID + ".";
    }
}

