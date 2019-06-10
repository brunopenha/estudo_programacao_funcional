package br.nom.penha.bruno.streams;

import br.nom.penha.bruno.data.Student;
import br.nom.penha.bruno.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {
        // student name and activities in a map

        Predicate<Student> studentPredicate = student -> student.getGradeLevel()>=3;
        Predicate<Student> studentGpaPredicate = student -> student.getGpa()>=3.9;

        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()
                .filter(studentPredicate)    // Stream<Student>
                .filter(studentGpaPredicate) // Stream<Student>
                .collect(Collectors.toMap(Student::getName,Student::getActivities)); // Map


        System.out.println(studentMap);
    }
}
