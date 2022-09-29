package school;

import java.util.ArrayList;

public class Subject {
    private int subjectId;
    private String subjectName;
    private int gradeType;
    ArrayList<Student> studentList = new ArrayList<Student>();

    public void setGradeType(int gradeType) {
        this.gradeType = gradeType;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }


    public int getSubjectId() {
        return subjectId;
    }

    public int getGradeType() {
        return gradeType;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public Subject(int subjectId, String subjectName){
        this.subjectId = subjectId;
        this.subjectName = subjectName;
    }



}
