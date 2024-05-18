import org.junit.Test;
import org.skillmea.school.Subject;
import org.skillmea.school.Teacher;

import static org.junit.Assert.*;

public class TeacherTest {

    @Test
    public void testAddSubject() {
        Teacher teacher = new Teacher("John Doe");
        Subject subject = new Subject("Math", teacher);
        teacher.addSubject(subject);
        assertEquals(1, teacher.getSubjects().size());
    }

    @Test
    public void testGetSubjects() {
        Teacher teacher = new Teacher("John Doe");
        Subject subject1 = new Subject("Math", teacher);
        Subject subject2 = new Subject("Physics", teacher);
        teacher.addSubject(subject1);
        teacher.addSubject(subject2);
        assertEquals(2, teacher.getSubjects().size());
    }
}
