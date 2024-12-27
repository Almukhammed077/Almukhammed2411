public class Teacher extends Person {
    private String subject;
    private int yearsOfExperience;
    private int salary;

    public Teacher(String name, int age, String surname, boolean gender, String subject, int yearsOfExperience, int salary) {
        super(name, age, surname, gender);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public void giveRaise(double percentage) {
        if (percentage > 0) {
            this.salary += (int)(this.salary * (percentage / 100));
        } else {
            System.out.println("Invalid raise percentage.");
        }
    }

    public int getSalary() {
        return salary;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }


    @Override
    public String toString() {
        return super.toString() + " I teach " + subject + ".";
    }
}
