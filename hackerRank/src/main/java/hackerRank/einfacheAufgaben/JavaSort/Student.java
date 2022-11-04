package hackerRank.einfacheAufgaben.JavaSort;

import java.util.*;

//class Student implements Comparable<Student> { // implementiert Comparable
class Student {

    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }

//    Überschreibt die compareTo Methode:
//    @Override
//    public int compareTo(Student o) {
//        return Comparator
//                .comparingDouble(Student::getCgpa)
//                .reversed()
//                .thenComparing(Student::getFname)
//                .thenComparingInt(Student::getId)
//                .compare(this, o);
//    }
}


