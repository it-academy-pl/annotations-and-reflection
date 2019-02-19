package pl.itacademy;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.set(2019, 3, 2);
        calendar.getTime();
        Date today = calendar.getTime();
        Student student1 = new Student(1L, "Rafal", "Bednarz", today);
        Student student2 = new Student(1L, "Rafal", "Bednarz", today);

        System.out.println("student1 and student2 are equal: " + student1.equals(student2));

    }
}
