package chapter3.varianta.student;

import java.time.LocalDate;

public class Runner {
    private static final StudentRepository STUDENT_REPOSITORY = new StudentRepository();
    //константа, щоб ми не могли міняти значення STUDENT_REPOSITORY, ця змінна створюється лише один раз
    //private static final приватна, відноситься тількт до цьго класу і її не можна змінити

    public static void main(String[] args) {
        fillRepository();//цей метод заповнює наш STUDENT_REPOSITORY

        System.out.println("List of students of a given faculty:");
        System.out.println(STUDENT_REPOSITORY.findByFacultyStudents("Java"));
        System.out.println();
        System.out.println("List faculty and course:");
        System.out.println(STUDENT_REPOSITORY.findByFacultyAndCourseStudents("Java", 1));
        System.out.println();
        System.out.println("List of birth year:");
        System.out.println(STUDENT_REPOSITORY.findByBirthAfterGivenYearStudents(1990));
        System.out.println();
        System.out.println("List of group:");
        System.out.println(STUDENT_REPOSITORY.finByGroupStudents("1A"));
    }

    private static void fillRepository() {
        Student firstStudent = new Student(123456, "Maksimskiy", "Maksim", LocalDate.of(1989, 2, 9),
                "Address 1", "456987123", "Java", 2, "1A");
        Student secondStudent = new Student(789123, "Vasylskiy", "Vasyl", LocalDate.of(1985, 5, 25),
                "Address 2", "789321456", "Java", 1, "2B");
        Student thirdStudent = new Student(456789, "Petrovskiy", "Petro", LocalDate.of(2000, 11, 25),
                "Address 3", "36985147", "JS", 3, "1A");
        Student fourthStudent = new Student(321654, "Stepanskiy", "Stepan", LocalDate.of(1988, 5, 1),
                "Address 4", "147852369", "Java", 2, "3A");
        Student fifthStudent = new Student(654987, "Dmitrovskiy", "Dmitro", LocalDate.of(1987, 11, 5),
                "Address 5", "456987123", "PHP", 4, "2B");
        Student sixthStudent = new Student(147258, "Evgenskiy", "Evgen", LocalDate.of(1985, 4, 15),
                "CAddress 6", "325698741", "C++", 1, "2G");

        STUDENT_REPOSITORY.addStudents(firstStudent);
        STUDENT_REPOSITORY.addStudents(secondStudent);
        STUDENT_REPOSITORY.addStudents(thirdStudent);
        STUDENT_REPOSITORY.addStudents(fourthStudent);
        STUDENT_REPOSITORY.addStudents(fifthStudent);
        STUDENT_REPOSITORY.addStudents(sixthStudent);
    }
}

