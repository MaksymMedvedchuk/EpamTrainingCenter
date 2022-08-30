package chapter3.varianta.student;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Predicate;

public class Student {
    private int id;
    private String Surname;
    private String Name;
    private LocalDate birthday;
    private String address;
    private int phoneNumber;
    private String faculty;
    private int course;
    private String group;

    public Student(int id, String surname, String name, LocalDate birthday, String address, int phoneNumber
            , String faculty, int course, String group) {
        this.id = id;
        Surname = surname;
        Name = name;
        this.birthday = birthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public static void checkStudent(List<Student> studentList, Predicate<Student> predicate) {
        for (Student student : studentList) {
            if (predicate.test(student)) {
                student.printInfo();
            }
        }
    }

    public void printInfo() {
        System.out.println(id + " " + Surname + " " + Name + " " + birthday + " " + address + " " + phoneNumber
                + " " + faculty + " " + course + " " + group);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Surname='" + Surname + '\'' +
                ", Name='" + Name + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
