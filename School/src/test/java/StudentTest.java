import org.junit.Test;
import org.skillmea.school.Clazz;
import org.skillmea.school.Student;
import org.skillmea.school.Subject;
import org.skillmea.school.Teacher;

import static org.junit.Assert.*;

public class StudentTest {

    @Test(expected = RuntimeException.class)
    public void testSetClazzTwice() {
        Teacher teacher = new Teacher("John Doe");
        Clazz clazz1 = new Clazz("1.A", teacher);
        Clazz clazz2 = new Clazz("2.B", teacher);
        Student student = new Student("Alice");
        clazz1.addStudent(student);
        clazz2.addStudent(student); // Should throw exception
    }

    @Test(expected = RuntimeException.class)
    public void testEnrollWithInvalidGrade() {
        Teacher teacher = new Teacher("John Doe");
        Student student = new Student("Alice");
        student.enroll(new Subject("Math", teacher), 6); // Should throw exception
    }

    @Test(expected = RuntimeException.class)
    public void testAverageGradeWithLessThanThreeSubjects() {
        Teacher teacher = new Teacher("John Doe");
        Student student = new Student("Alice");
        student.enroll(new Subject("Math", teacher), 4);
        student.enroll(new Subject("Physics", teacher), 3);
        student.getAverageGrade(); // Should throw exception
    }

    @Test
    public void testAverageGradeWithThreeSubjects() {
        Teacher teacher = new Teacher("John Doe");
        Student student = new Student("Alice");
        student.enroll(new Subject("Math", teacher), 4);
        student.enroll(new Subject("Physics", teacher), 3);
        student.enroll(new Subject("History", teacher), 5);
        assertEquals(4.0, student.getAverageGrade(), 0.01);
    }
}
