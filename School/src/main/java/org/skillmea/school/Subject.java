package org.skillmea.school;

import java.util.HashMap;
import java.util.Map;

public class Subject {
    private String name;
    private Teacher teacher;
    private Map<Student, Integer> studentGrades;

    public Subject(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
        this.studentGrades = new HashMap<>();
        teacher.addSubject(this);
    }

    public String getName() {
        return name;
    }

    public void addStudentGrade(Student student, int grade) {
        studentGrades.put(student, grade);
    }

    public double getAverageGrade() {
        return studentGrades.values().stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
    }
}