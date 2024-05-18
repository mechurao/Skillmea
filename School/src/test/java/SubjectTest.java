import org.junit.Test;
import org.skillmea.school.Student;
import org.skillmea.school.Subject;
import org.skillmea.school.Teacher;

import static org.junit.Assert.*;

public class SubjectTest {

    @Test
    public void testAddStudentGrade() {
        Teacher teacher = new Teacher("John Doe");
        Subject subject = new Subject("Math", teacher);
        Student student = new Student("Alice");
        subject.addStudentGrade(student, 4);
        assertEquals(4.0, subject.getAverageGrade(), 0.01);
    }

    @Test
    public void testAverageGrade() {
        Teacher teacher = new Teacher("John Doe");
        Subject subject = new Subject("Math", teacher);
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        subject.addStudentGrade(student1, 4);
        subject.addStudentGrade(student2, 3);
        assertEquals(3.5, subject.getAverageGrade(), 0.01);
    }
}
