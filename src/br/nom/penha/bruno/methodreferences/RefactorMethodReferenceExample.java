package br.nom.penha.bruno.methodreferences;

import br.nom.penha.bruno.data.Student;
import br.nom.penha.bruno.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {

    static Predicate<Student> p1 = RefactorMethodReferenceExample::greaterThanGradeLevel;

    public static boolean greaterThanGradeLevel(Student s){
        return s.getGradeLevel() >= 3;
    }

    public static void main(String[] args) {

        System.out.println(p1.test(StudentDataBase.studentSupplier.get()));
    }
}
