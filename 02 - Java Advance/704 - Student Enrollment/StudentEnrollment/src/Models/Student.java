package Models;

public class Student {
    private int stuNo;
    private String firstName;
    private String lastName;

    public Student(int stuNo, String firstName, String lastName) {
        this.stuNo = stuNo;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student() {
    }

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
