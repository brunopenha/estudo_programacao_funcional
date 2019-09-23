package br.nom.penha.bruno.streams;

import br.nom.penha.bruno.data.Student;
import br.nom.penha.bruno.data.StudentDataBase;

public class StreamMapReduceExample {

    private static int numeroDeNotebooks(){
        int numNotebooks = StudentDataBase.getAllStudents().stream() // Stream<Student>
                .filter((estudante -> estudante.getGradeLevel() >= 3))
                .filter((estudante -> estudante.getGender().equals("female")))
                .map(Student::getNotebooks) // Stream<Integer>
                //.reduce(0,(a,b) -> a+b);
                .reduce(0,Integer::sum);
        return numNotebooks;
    }
    public static void main(String[] args) {

        System.out.println("No. de notebooks: " + numeroDeNotebooks());
    }
}
