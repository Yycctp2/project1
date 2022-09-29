package school;

public class Score {
    private int studentId;
    private Subject subject;
    private int point;

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getPoint() {
        return point;
    }

    public Subject getSubject() {
        return subject;
    }

    public Score(int studentId, Subject subject, int point){
        this.studentId = studentId;
        this.point = point;
        this.subject = subject;
    }

}
