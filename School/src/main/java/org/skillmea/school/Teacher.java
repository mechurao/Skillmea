package org.skillmea.school;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{

    private List<Subject> subjects;

    public Teacher(String name) {
        super(name);
        this.subjects = new ArrayList<>();
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public List<Subject> getSubjects() {
        return subjects;
    }
}
