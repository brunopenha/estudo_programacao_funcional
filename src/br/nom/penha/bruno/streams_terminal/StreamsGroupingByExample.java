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

    public static void customizedgroupStudentsByGpa(){
        Map<String,List<Student>> listMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(student -> student.getGpa() >= 3.8? "Muito bom!" : "Mediocre"));

        System.out.println("Lista com alunos female[] e male[]: \n" + listMap);
    }

    public static void customizedgroupStudentsByGpaAndByGradeLevel(){ //two level grouping
        Map<Integer,Map<String,List<Student>>> listMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                         Collectors.groupingBy(student -> student.getGpa() >= 3.8? "Muito bom!" : "Mediocre")));

        System.out.println(" Lista com alunos por Grade Level com o Melhor e pior GPA:\n "+ listMap);
    }

    public static void customizedgroupStudentsByGradeLevelAndSumOfNotebooks(){ //two level grouping
        Map<Integer,Integer> listMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                         Collectors.summingInt(Student::getNotebooks)));

        System.out.println("Lista com o total de notebooks por Grade Level\n " + listMap);
    }

    public static void customizedgroupStudentsByNameAndSumOfNotebooks(){ //two level grouping
        Map<String,Integer> listMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getName,
                        Collectors.summingInt(Student::getNotebooks)));

        System.out.println("Lista com o total de notebooks por Grade Level\n " + listMap);
    }

    public static void main(String[] args) {

        System.out.println("*************************");
        groupStudentsByGender();
        System.out.println("*************************");
        customizedgroupStudentsByGpa();
        System.out.println("*************************");
        customizedgroupStudentsByGpaAndByGradeLevel();
        System.out.println("*************************");
        customizedgroupStudentsByGradeLevelAndSumOfNotebooks();
        System.out.println("*************************");
        customizedgroupStudentsByNameAndSumOfNotebooks();
        System.out.println("*************************");
    }
}
