package org.skillmea.school;

import java.util.ArrayList;
import java.util.List;

public class Clazz {
    private String name;
    private Teacher primaryTeacher;
    private List<Student> students;

    public Clazz(String name, Teacher primaryTeacher) {
        this.name = name;
        this.primaryTeacher = primaryTeacher;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        if (students.contains(student)) {
            throw new RuntimeException("Student is already in this class.");
        }
        students.add(student);
        student.setClazz(this);
    }

    public double getAverageGrade() {
        if (students.size() < 3) {
            throw new RuntimeException("Each class must have at least 3 students.");
        }
        return students.stream()
                .mapToDouble(Student::getAverageGrade)
                .average()
                .orElse(0);
    }
}
