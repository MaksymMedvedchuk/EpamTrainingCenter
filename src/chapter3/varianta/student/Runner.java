package chapter3.varianta.student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Student firstStudent = new Student(123456, "Maksimskiy", "Maksim", LocalDate.of(1989, 2,9),
                "Address 1", 456987123, "Java", 2, "1A");
        Student secondStudent = new Student(789123, "Vasylskiy", "Vasyl", LocalDate.of(1985, 5, 25),
                "Address 2", 789321456, "Java", 1, "2B");
        Student thirdStudent = new Student(456789, "Petrovskiy", "Petro", LocalDate.of(2000, 11, 25),
                "Address 3", 36985147, "JS", 3, "1A");
        Student fourthStudent = new Student(321654, "Stepanskiy", "Stepan", LocalDate.of(1988, 5, 1),
                "Address 4", 147852369, "Java", 2, "3A");
        Student fifthStudent = new Student(654987, "Dmitrovskiy", "Dmitro", LocalDate.of(1987, 11, 5),
                "Address 5", 456987123, "PHP", 4, "2B");
        Student sixthStudent = new Student(147258, "Evgenskiy", "Evgen", LocalDate.of(1985, 4 ,15),
                "CAddress 6", 325698741, "C++", 1, "2G");

        List<Student> listStudent = new ArrayList<>();
        listStudent.add(firstStudent);
        listStudent.add(secondStudent);
        listStudent.add(thirdStudent);
        listStudent.add(fourthStudent);
        listStudent.add(fifthStudent);
        listStudent.add(sixthStudent);

        System.out.println("List of students of a given faculty:");
        Student.checkStudent(listStudent, x -> x.getFaculty().equals("Java"));
        System.out.println();
        System.out.println("Lists of students for each faculty and course:");
        Student.checkStudent(listStudent, x -> x.getFaculty().equals("Java") && x.getCourse() == 2);
        System.out.println();
        System.out.println("List of students born after a given year:");
        Student.checkStudent(listStudent, x -> x.getBirthday().getYear() > 1985);
        System.out.println();
        System.out.println("Study group list:");
        Student.checkStudent(listStudent, x -> x.getGroup().equals("1A"));
    }
}

