package org.skillmea.school;

abstract  class Person {
    protected String name;

    Person(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
