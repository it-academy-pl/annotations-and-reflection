package pl.itacademy;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Date today = new Date(2019, 3, 2);
        Student student1 = new Student(1L, "Rafal", "Bednarz", today);
        Student student2 = new Student(1L, "Rafal", "Bednarz", today);

        System.out.println("student1 and student2 are equal: " + student1.equals(student2));

    }
}
