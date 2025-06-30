package Models;

public class Enrollment {
    private int stuNo;
    private int classId;
    private String enrollDate;

    public Enrollment(int stuNo, int classId, String enrollDate) {
        this.stuNo = stuNo;
        this.classId = classId;
        this.enrollDate = enrollDate;
    }

    public Enrollment() {
    }

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(String enrollDate) {
        this.enrollDate = enrollDate;
    }
}
