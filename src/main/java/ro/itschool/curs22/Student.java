package ro.itschool.curs22;

import java.util.Objects;

public class Student {
    String name;
    String course;
    int grade;
    String group;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return grade == student.grade &&
                name.equals(student.name) &&
                course.equals(student.course) &&
                group.equals(student.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course, grade, group);
    }

    public Student(String name, String course, int grade, String group) {
        this.name = name;
        this.course = course;
        this.grade = grade;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public int getGrade() {
        return grade;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", grade=" + grade +
                ", group='" + group + '\'' +
                '}';
    }
}
