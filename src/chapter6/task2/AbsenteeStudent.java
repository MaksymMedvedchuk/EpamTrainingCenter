package chapter6.task2;

public class AbsenteeStudent extends Student {

    public AbsenteeStudent(String name, String surname, int age, double mathGrade, double englishGrade) {
        super(name, surname, age, mathGrade, englishGrade);
    }

    @Override
    public void passExam(int gradePass) {
        if (gradePass <= 0) throw new IllegalArgumentException("You entered an incorrect value");
        System.out.println(gradePass <= 6 ? "Student didn't pass the exam" : "Student pass the exam");
    }

    @Override
    public void chooseSpecialty(double mathGrade, double englishGrade) {
        System.out.println((getAverageGrade() > 7) ? "You can choose a specialty" : "You didn't receive a passing grade");
    }
}

