package com.nf.linkedStudent;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       Student art = new Student("art", "m",123);
        Student art1= new Student();
       List<Student> students = new ArrayList<>();
students.add(art);
students.add(art1);
        //students.set(0,art);
        students.add(1,art1);
        System.out.println(students.get(0));
        System.out.println(students.get(1));

    }
}
