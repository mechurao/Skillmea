package org.skillmea.school;

import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;
import java.util.Map;

public class Student  extends Person{

    private Clazz clazz;
    private Map<Subject, Integer> grades;

    public Student(String name) {
        super(name);
        this.grades = new HashMap<>();
    }



    public void setClazz(Clazz clazz) {
        if (this.clazz != null) {
            throw new RuntimeException("Student is already a member of a class.");
        }
        this.clazz = clazz;
    }

    public void enroll(Subject subject, int grade) {
        if (grade < 1 || grade > 5) {
            throw new RuntimeException("Grade must be between 1 and 5.");
        }
        grades.put(subject, grade);
        subject.addStudentGrade(this, grade);
    }

    public double getAverageGrade() {
        if (grades.size() < 3) {
            throw new RuntimeException("Student must take at least 3 subjects.");
        }
        return grades.values().stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
    }
}

