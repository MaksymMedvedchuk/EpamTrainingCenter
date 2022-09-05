package chapter3.varianta.student;

import helper.FixedToStringArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentRepository {

    private final List<Student> students = new ArrayList<>();

    public void addStudents(Student inputStudent) {
        students.add(inputStudent);
    }

    public List<Student> findByFacultyStudents(String inputFaculty) {
        return fixToString(students.stream().filter(student -> student.getFaculty().equals(inputFaculty)).collect(Collectors.toList()));
    }

    public List<Student> findByFacultyAndCourseStudents(String inputFaculty, int inputCourse) {
        return fixToString(students.stream().filter(student -> student.getFaculty().equals(inputFaculty)
                && student.getCourse() == inputCourse).collect(Collectors.toList()));
    }

    public List<Student> findByBirthAfterGivenYearStudents(int inputYear) {
        return fixToString(students.stream().filter(student -> student.getBirthday().getYear() > inputYear).collect(Collectors.toList()));
    }

    public List<Student> finByGroupStudents(String inputGroup) {
        return fixToString(students.stream().filter(student -> student.getGroup().equals(inputGroup)).collect(Collectors.toList()));
    }

    private List<Student> fixToString(List<Student> students){
        List<Student> list = new FixedToStringArrayList<>(); //створюємо FixToStringArrayList в який додаємо всіх студентів і нам повертає новий ліст
        list.addAll(students);
        return list;
    }
}


