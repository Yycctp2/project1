package school;

import java.util.ArrayList;

public class Student {
    private int studentId;
    private String studentName;
    private Subject majorSubject;

    private ArrayList<Score> scoreList = new ArrayList<Score>();

    public void addSubjectScore(Score score) {
        scoreList.add(score);
    }

    public Student(int studentId, String studentName, Subject majorSubject){
        this.studentId = studentId;
        this.studentName = studentName;
        this.majorSubject = majorSubject;
    }

}
