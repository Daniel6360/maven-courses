package ro.itschool.curs22;

import java.util.List;

public class MethodRefs {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("John", "Math", 8, "First"),
                new Student("Barry", "Biology", 8, "Second"),
                new Student("Allan", "Chemistry", 10, "Third"),
                new Student("Ana", "Music", 9, "Fourth"),
                new Student("Radu", "Music", 7, "Fourth"),
               new Student("Radu", "Math", 7, "Fourth")
        );

        StudentService std = new StudentService(list);
        System.out.println(std.getAverage("Music"));

        System.out.println(std.getMaxForGroup("Fourth"));

        System.out.println(std.getDistinctGrades());

        System.out.println(std.mapToNote());
    }
}
