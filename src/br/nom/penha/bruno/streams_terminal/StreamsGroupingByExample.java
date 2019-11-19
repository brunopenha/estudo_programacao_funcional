package br.nom.penha.bruno.streams_terminal;

import br.nom.penha.bruno.data.Student;
import br.nom.penha.bruno.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsGroupingByExample {

    public static void groupStudentsByGender(){
        Map<String,List<Student>> listMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGender));

        System.out.println(listMap);
    }

    public static void customizedgroupStudentsByGender(){
        Map<String,List<Student>> listMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(student -> student.getGpa() >= 3.8? "Muito bom!" : "Mediocre"));

        System.out.println(listMap);
    }

    public static void main(String[] args) {

        groupStudentsByGender();
        customizedgroupStudentsByGender();
    }
}
