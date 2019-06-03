package br.nom.penha.bruno.funcionalinterfaces;

import br.nom.penha.bruno.data.Student;
import br.nom.penha.bruno.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudantExample {

    static Function<List<Student>,Map<String,Double>> studantFunction = (students -> {
       Map<String, Double> studantGradeMap = new HashMap<>();

       students.forEach((student -> {

           if(PredicateStudentExample.p1.test(student)){
               studantGradeMap.put(student.getName(), student.getGpa());
           }

       }));

       return studantGradeMap;
    });

    public static void main(String[] args) {

        System.out.println(studantFunction.apply(StudentDataBase.getAllStudents()));
    }
}
