import org.junit.Test;
import org.skillmea.school.Clazz;
import org.skillmea.school.Student;
import org.skillmea.school.Subject;
import org.skillmea.school.Teacher;

import static org.junit.Assert.*;

public class ClazzTest {

    @Test(expected = RuntimeException.class)
    public void testAddStudentTwice() {
        Teacher teacher = new Teacher("John Doe");
        Clazz clazz = new Clazz("1.A", teacher);
        Student student = new Student("Alice");
        clazz.addStudent(student);
        clazz.addStudent(student); // Should throw exception
    }

    @Test(expected = RuntimeException.class)
    public void testAverageGradeWithLessThanThreeStudents() {
        Teacher teacher = new Teacher("John Doe");
        Clazz clazz = new Clazz("1.A", teacher);
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        clazz.addStudent(student1);
        clazz.addStudent(student2);
        clazz.getAverageGrade(); // Should throw exception
    }

    @Test
    public void testAverageGradeWithThreeStudents() {
        Teacher teacher = new Teacher("John Doe");
        Clazz clazz = new Clazz("1.A", teacher);
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        Student student3 = new Student("Charlie");

        clazz.addStudent(student1);
        clazz.addStudent(student2);
        clazz.addStudent(student3);

        student1.enroll(new Subject("Math", teacher), 4);
        student1.enroll(new Subject("Physics", teacher), 3);
        student1.enroll(new Subject("History", teacher), 5);

        student2.enroll(new Subject("Math", teacher), 4);
        student2.enroll(new Subject("Physics", teacher), 3);
        student2.enroll(new Subject("History", teacher), 5);

        student3.enroll(new Subject("Math", teacher), 4);
        student3.enroll(new Subject("Physics", teacher), 3);
        student3.enroll(new Subject("History", teacher), 5);

        assertEquals(4.0, clazz.getAverageGrade(), 0.01);
    }
}
