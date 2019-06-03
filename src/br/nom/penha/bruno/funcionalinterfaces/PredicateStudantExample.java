package br.nom.penha.bruno.funcionalinterfaces;

import br.nom.penha.bruno.data.Student;
import br.nom.penha.bruno.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudantExample {

    static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;

    static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;

    public static void filterStudantByGradeLevel(){
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach((student -> {
            if(p1.test(student)){
                System.out.println(student);
            }
        }));
    }

    public static void filterStudantByGPA(){
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(student -> {
            if(p2.test(student)){
                System.out.println(student);
            }
        });
    }

    public static  void filterStudents(){
            List<Student> studentList = StudentDataBase.getAllStudents();

            studentList.forEach(student -> {
                if(p1.or(p2).negate().test(student)){
                    System.out.println(student);
                }
            });

    }
    public static void main(String[] args) {

        System.out.println("filterStudantByGradeLevel:");

        filterStudantByGradeLevel();

        System.out.println("filterStudantByGPA:");
        filterStudantByGPA();

        System.out.println("*******************");
        System.out.println("filterStudents:");
                filterStudents();
    }
}
