package chapter3.varianta.student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentRepository {

    private final List<Student> students = new ArrayList<>(); //

    public void addStudents(Student inputStudent) {
        students.add(inputStudent);
    }

    public List<Student> findStudentByFaculty(String inputFaculty) {
        return students.stream().filter(student -> student.getFaculty().equals(inputFaculty)).collect(Collectors.toList());
    }

    public List<Student> findStudentFacultyAndCourse(String inputFaculty, int inputCourse) {
        return students.stream().filter(student -> student.getFaculty().equals(inputFaculty) && student.getCourse() == inputCourse).collect(Collectors.toList());
    } //якщо піти в collect то він приймає Collector

    public List<Student> findStudentBirthAfterGivenYear(int inputYear) {
        return students.stream().filter(student -> student.getBirthday().getYear() > inputYear).collect(Collectors.toList());
    }

    public List<Student> findGroupList(String inputGroup) {
        return students.stream().filter(student -> student.getGroup().equals(inputGroup)).collect(Collectors.toList());
    }
}


