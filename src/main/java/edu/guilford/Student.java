package edu.guilford;
import java.util.Random;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double gpa;

    public Student() {
        Random random = new Random();
        this.id = random.nextInt(1000000);
        this.name = "Student" + this.id;
        this.gpa = random.nextDouble() * 4.0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }


    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }
    //toString method
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}