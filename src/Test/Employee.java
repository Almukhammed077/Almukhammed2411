package Test;
public class Employee {

    private static int id = 1;
    private int id_gen;
    private String name;
    private String surname;
    private int age;
    private boolean gender;
    private double salary;

    public Employee() {
        id_gen = id++;
    }

    public Employee(String name, String surname){
        this(); //call no arg constructor
        this.name = name;
    }

    public Employee(String name, String surname, int age, boolean gender, double salary) {
        this();
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Employer's id: " + id_gen +
                "\nFull name: " + name + " " + surname +
                "\nAge: " + age +
                "\nGender: " + (gender ? "male" : "female") +
                "\nSalary: " + salary;
    }

}