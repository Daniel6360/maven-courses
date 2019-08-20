package ro.itschool.curs22;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;


public class StudentService {
    private final List<Student> students;

    public StudentService(List<Student> students) {
        this.students = students;
    }

    public boolean checkFailedFilterFirst() {
        return students.stream()
                .filter(student -> student.getGrade() <= 4)
                .findFirst()
                .isPresent();
    }

    public boolean checkFailedFilter() {
        return students.stream()
                .filter(student -> student.getGrade() <= 4)
                .findAny()
                .isPresent();
    }

    public boolean checkFailedMin() {
        return students.stream()
                .mapToInt(Student::getGrade)
                .min()
                .orElse(5) <= 4;
    }


    public Double getAverageGrade() {
        return students.stream()
                .mapToInt(Student::getGrade)
                .average()
                .orElse(0d);
    }

    public boolean checkIfFailed1() {
        return students.stream()
                .mapToInt(Student::getGrade)
                .anyMatch(grade -> grade > 4);
    }

    public boolean checkFailedAllMatch() {
        return students.stream()
                .allMatch(this::studentsPassed);
    }

    public boolean studentsPassed(Student student) {
        return student.getGrade() > 4;
    }

    public double getAverage(String course) {
        return students.stream()
                .filter(student -> student.getCourse().equals(course))
                .mapToInt(Student::getGrade)
                .average()
                .orElse(0d);
    }

    public double getMaxForGroup(String group) {
        return students.stream()
                .filter(student -> student.getGroup().equals(group))
                .mapToInt(Student::getGrade)
                .max()
                .orElse(0);
    }

    public List<Integer> getDistinctGrades() {
        return students.stream()
                .mapToInt(Student::getGrade)
                .distinct()
                .boxed()
                .collect(Collectors.toList());
    }

    public Map<String, Integer> mapNameToGrade() {
        return students.stream()
                .collect(toMap(Student::getName, Student::getGrade, this::avg

                ));
    }

    private int avg(Integer oldGrade, Integer newGrade) {
        return Math.round((oldGrade + newGrade) / 2);
    }

    public Map<String,List<Integer>> mapToNote() {
        return students.stream()

                .collect(toMap(Student::getName,student -> buildList(student),this::mergeLists));
    }

    private List<Integer> buildList(Student student) {
        List<Integer>list=new ArrayList<>(0);
        list.add(student.getGrade());
        return list;
    }

    private List<Integer> mergeLists(List<Integer>list1,List<Integer> list2){
        List<Integer>result=new ArrayList<>();
        list1.addAll(list2);
        result.addAll(list1);
        return result;
    }

}


