package school.test;

import school.School;
import school.Score;
import school.Student;
import school.Subject;
import school.report.GenerateGradeReport;
import utills.Define;

public class TestMain {

    private School school = School.getInstance();
    private Subject korean;
    private Subject math;
    private GenerateGradeReport gradeReport = new GenerateGradeReport();

    public static void main(String[] args) {
        TestMain test = new TestMain();
        test.korean = new Subject(Define.KOREAN,"국어");
        test.math = new Subject(Define.MATH, "수학");

        test.school.addSubject(test.korean);
        test.school.addSubject(test.math);




        Student student1 = new Student(20613, "윤현윤", test.korean);
        Student student2 = new Student(20614, "윤현이", test.math);
        Student student3 = new Student(20615, "윤현삼", test.korean);
        Student student4 = new Student(20616, "윤현사", test.korean);
        Student student5 = new Student(20617, "윤현오", test.korean);

        test.school.addStudent(student1);
        test.school.addStudent(student2);
        test.school.addStudent(student3);
        test.school.addStudent(student4);
        test.school.addStudent(student5);

        test.korean.register(student1);
        test.korean.register(student2);
        test.korean.register(student3);
        test.korean.register(student4);
        test.korean.register(student5);

        test.math.register(student1);
        test.math.register(student2);
        test.math.register(student3);
        test.math.register(student4);
        test.math.register(student5);




        test.addScoreForStudent(student1, test.korean, 95);
        test.addScoreForStudent(student1, test.math, 43);

        test.addScoreForStudent(student2, test.korean, 97);
        test.addScoreForStudent(student2, test.math, 44);
        test.addScoreForStudent(student3, test.korean, 91);
        test.addScoreForStudent(student3, test.math, 44);
        test.addScoreForStudent(student4, test.korean, 91);
        test.addScoreForStudent(student4, test.math, 44);
        test.addScoreForStudent(student5, test.korean, 91);
        test.addScoreForStudent(student5, test.math, 44);


        GenerateGradeReport report = new GenerateGradeReport();
        System.out.println(report.getReport());
    }

    private void addScoreForStudent(Student student, Subject subject, int point){
        Score score = new Score(student.getStudentId(), subject, point);
        student.addSubjectScore(score);
    }

}

