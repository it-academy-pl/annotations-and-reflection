package pl.itacademy;

import java.util.Date;
import java.util.Objects;

public class Student {
    private long id;
    private String name;
    private String surname;
    private Date installmentDueDate;

    public Student(long id, String name, String surname, Date installmentDueDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.installmentDueDate = installmentDueDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname) &&
                Objects.equals(installmentDueDate, student.installmentDueDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, installmentDueDate);
    }
}
