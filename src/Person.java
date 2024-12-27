public class Person {
    private String name;
    private int age;
    private String surname;
    private boolean gender;
    public Person(String name, int age, String surname, boolean gender) {
        this.name = name;
        this.age = age;
        this.surname = surname;
        this.gender = gender;    }
    public String getName() {

        return name;
    }
    public int getAge() {

        return age;
    }
    public String getSurname() {
        return surname;    }
    public boolean isGender() {

        return gender;
    }
    public void setName(String name) {

        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;    }
    public void setSurname(String surname) {

        this.surname = surname;
    }
    public void setGender(boolean gender) {
        this.gender = gender;    }
    public String toString() {
        String genderStr = gender ? "Male" : "Female";
        return "Hi, I am " + name + " " + surname + ", a " + age + "-year-old " + genderStr + ".";    }
}
