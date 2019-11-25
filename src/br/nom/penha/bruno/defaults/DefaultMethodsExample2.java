package br.nom.penha.bruno.defaults;

import br.nom.penha.bruno.data.Student;
import br.nom.penha.bruno.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodsExample2 {

    static Consumer<Student> studentConsumer = (student -> System.out.println(student));

    public static void sortByName(List<Student> list){

        System.out.println("After sort");
        Comparator<Student> nameComparator = Comparator.comparing(Student::getName);

        list.sort(nameComparator);
    }

    public static void sortByGPA(List<Student> list){

        System.out.println("After sort");
        Comparator<Student> nameComparator = Comparator.comparingDouble(Student::getGpa);

        list.sort(nameComparator);
    }

    public static void comparatorChaining(List<Student> list){
        System.out.println("After comparator");

        Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);
        Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
        list.sort(gradeComparator.thenComparing(nameComparator));
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();

        System.out.println("*********************\n\n");
        System.out.println(studentList);

        System.out.println("*********************\n\n");

        studentList.forEach(studentConsumer);

        System.out.println("*********************\n\n");
        sortByName(studentList);
        studentList.forEach(studentConsumer);

        System.out.println("*********************\n\n");
        sortByGPA(studentList);
        studentList.forEach(studentConsumer);

        System.out.println("*********************\n\n");
        comparatorChaining(studentList);
        studentList.forEach(studentConsumer);


    }
}
