package org.skillmea.school;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class School {
    private List<Clazz> classes;
    private List<Student> students;
    private List<Subject> subjects;

    public School() {
        this.classes = new ArrayList<>();
        this.students = new ArrayList<>();
        this.subjects = new ArrayList<>();
    }

    public void addClazz(Clazz clazz) {
        classes.add(clazz);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public void printSortedStudentsByAverageGrade() {
        List<Student> sortedStudents = students.stream()
                .sorted(Comparator.comparingDouble(Student::getAverageGrade))
                .collect(Collectors.toList());
        System.out.println("Sorted students by their average grades:");
        sortedStudents.forEach(student ->
                System.out.println(student.getName() + " - " + student.getAverageGrade()));
    }

    public void printSortedSubjectsByAverageGrade() {
        List<Subject> sortedSubjects = subjects.stream()
                .sorted(Comparator.comparingDouble(Subject::getAverageGrade))
                .collect(Collectors.toList());
        System.out.println("\nSorted subjects by average of grades given to students:");
        sortedSubjects.forEach(subject ->
                System.out.println(subject.getName() + " - " + subject.getAverageGrade()));
    }

    public void printSortedClassesByBestStudents() {
        List<Clazz> sortedClasses = classes.stream()
                .sorted(Comparator.comparingDouble(Clazz::getAverageGrade))
                .collect(Collectors.toList());
        System.out.println("\nSorted classes with the best students:");
        sortedClasses.forEach(clazz ->
                System.out.println(clazz.getName() + " - " + clazz.getAverageGrade()));
    }
}