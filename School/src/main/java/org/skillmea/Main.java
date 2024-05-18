package org.skillmea;


import org.skillmea.school.*;

public class Main {
    public static void main(String[] args) {

        School school = new School();

        // Create teachers
        Teacher teacher1 = new Teacher("John Doe");
        Teacher teacher2 = new Teacher("Jane Smith");

        // Create subjects
        Subject math = new Subject("Math", teacher1);
        Subject physics = new Subject("Physics", teacher2);
        Subject history = new Subject("History", teacher1);

        // Create students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        Student student3 = new Student("Mark");
        Student student4 = new Student("John");

        // Create classes
        Clazz clazz1 = new Clazz("1.A", teacher1);
        Clazz clazz2 = new Clazz("2.B", teacher2);

        // Add students to classes
        clazz1.addStudent(student1);
        clazz1.addStudent(student2);
        clazz1.addStudent(student4); // To ensure clazz1 has at least 3 students

        clazz2.addStudent(student3);

        // Enroll students in subjects
        student1.enroll(math, 4);
        student1.enroll(physics, 3);
        student1.enroll(history, 5);

        student2.enroll(math, 2);
        student2.enroll(physics, 4);
        student2.enroll(history, 3);

        student3.enroll(math, 3);
        student3.enroll(physics, 2);
        student3.enroll(history, 4);

        student4.enroll(math, 5);
        student4.enroll(physics, 4);
        student4.enroll(history, 4);

        // Add entities to school
        school.addClazz(clazz1);
        school.addClazz(clazz2);
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        school.addStudent(student4);
        school.addSubject(math);
        school.addSubject(physics);
        school.addSubject(history);

        // Print statistical data
        school.printSortedStudentsByAverageGrade();
        school.printSortedSubjectsByAverageGrade();
        school.printSortedClassesByBestStudents();
    }
}