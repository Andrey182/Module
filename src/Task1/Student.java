package Task1;

public class Student extends University {
    private final String surname;
    private String name;
    private String curname;
    Student(String name, String surname, String nameFaculty){
        this.name = name;
        this.surname = surname;
        super.nameFaculty = nameFaculty;
    }

}
