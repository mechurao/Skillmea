import org.junit.Test;
import org.skillmea.school.*;

import static org.junit.Assert.*;
import java.util.Arrays;

public class SchoolTest {

    @Test
    public void testPrintSortedStudentsByAverageGrade() {
        School school = new School();
        Teacher teacher = new Teacher("John Doe");

        Student student1 = new Student("Alice");
        student1.enroll(new Subject("Math", teacher), 4);
        student1.enroll(new Subject("Physics", teacher), 3);
        student1.enroll(new Subject("History", teacher), 5);

        Student student2 = new Student("Bob");
        student2.enroll(new Subject("Math", teacher), 2);
        student2.enroll(new Subject("Physics", teacher), 4);
        student2.enroll(new Subject("History", teacher), 3);

        school.addStudent(student1);
        school.addStudent(student2);

        // Test sorting functionality
        school.printSortedStudentsByAverageGrade();
    }

    @Test
    public void testPrintSortedSubjectsByAverageGrade() {
        School school = new School();
        Teacher teacher = new Teacher("John Doe");

        Subject math = new Subject("Math", teacher);
        Subject physics = new Subject("Physics", teacher);
        Subject history = new Subject("History", teacher);

        Student student1 = new Student("Alice");
        student1.enroll(math, 4);
        student1.enroll(physics, 3);
        student1.enroll(history, 5);

        Student student2 = new Student("Bob");
        student2.enroll(math, 2);
        student2.enroll(physics, 4);
        student2.enroll(history, 3);

        school.addSubject(math);
        school.addSubject(physics);
        school.addSubject(history);

        // Test sorting functionality
        school.printSortedSubjectsByAverageGrade();
    }

    @Test
    public void testPrintSortedClassesByBestStudents() {
        School school = new School();
        Teacher teacher1 = new Teacher("John Doe");
        Teacher teacher2 = new Teacher("Jane Smith");

        Clazz clazz1 = new Clazz("1.A", teacher1);
        Clazz clazz2 = new Clazz("2.B", teacher2);

        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        Student student3 = new Student("Charlie");

        clazz1.addStudent(student1);
        clazz1.addStudent(student2);
        clazz2.addStudent(student3);

        student1.enroll(new Subject("Math", teacher1), 4);
        student1.enroll(new Subject("Physics", teacher1), 3);
        student1.enroll(new Subject("History", teacher1), 5);

        student2.enroll(new Subject("Math", teacher1), 4);
        student2.enroll(new Subject("Physics", teacher1), 3);
        student2.enroll(new Subject("History", teacher1), 5);

        student3.enroll(new Subject("Math", teacher2), 4);
        student3.enroll(new Subject("Physics", teacher2), 3);
        student3.enroll(new Subject("History", teacher2), 5);

        school.addClazz(clazz1);
        school.addClazz(clazz2);

        // Test sorting functionality
        school.printSortedClassesByBestStudents();
    }
}
