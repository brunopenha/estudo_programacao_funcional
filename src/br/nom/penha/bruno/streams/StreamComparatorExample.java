package br.nom.penha.bruno.streams;

import br.nom.penha.bruno.data.Student;
import br.nom.penha.bruno.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamComparatorExample {

    public static List<Student> sorteStudantsByName(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    public static List<Student> sorteStudantsByGpa(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
    }

    public static List<Student> sorteStudantsByGpaDescending(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        System.out.println("By name");
        sorteStudantsByName().forEach(System.out::println);

        System.out.println("By Gpa");
        sorteStudantsByGpa().forEach(System.out::println);

        System.out.println("By Gpa Descending");
        sorteStudantsByGpaDescending().forEach(System.out::println);


    }

}
