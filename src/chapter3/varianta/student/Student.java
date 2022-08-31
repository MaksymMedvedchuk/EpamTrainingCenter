package chapter3.varianta.student;

import java.time.LocalDate;

public class Student {
    private int id;
    private String surname;
    private String name;
    private LocalDate birthday;
    private String address;
    private String phoneNumber;
    private String faculty;
    private int course;
    private String group;

    public Student(int id, String surname, String name, LocalDate birthday, String address, String phoneNumber
            , String faculty, int course, String group) {
        setId(id); //тут через сеттерб, щоб ми могли змінювати нам метод
        setSurname(surname);
        setName(name);
        setBirthday(birthday);
        setAddress(address);
        setPhoneNumber(phoneNumber);
        setFaculty(faculty);
        setCourse(course);
        setGroup(group);
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}';
    }

    //так як кожен обєкт належить до класу Обджект то в нього є метод toString і цим методом ми його оверайдим щоб вивело в читабельній формі?

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
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
