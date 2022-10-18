package school;

import java.util.ArrayList;

public class School {
    private static School instance = new School();
    private  static String SCHOOL_NAME = "Semyeong Computer Highschool";
    private ArrayList<Subject> subjectList = new ArrayList<Subject>();
    private ArrayList<Student> studentList = new ArrayList<Student>();
    private School(){};

    public static School getInstance() {
        if(instance == null){
            instance = new School();
        }
        return instance;
    }


    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public ArrayList<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(ArrayList<Subject> subjectList){
        this.subjectList = subjectList;
    }

}
