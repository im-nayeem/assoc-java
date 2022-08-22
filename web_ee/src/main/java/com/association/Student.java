package com.association;

import java.util.Objects;

public class Student {
    private String name;
    private int id;
    private String dept;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }

    Student(String name,int id,String dept){
        this.name=name;
        this.id=id;
        this.dept=dept;
    }
    @Override
    public String toString()
    {
        return "Name: "+this.name+"\n ID: "+this.id+"\n Dept: "+this.dept;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name) && Objects.equals(dept, student.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, dept);
    }
}
