package chapter6.task2;

public abstract class StudentImpl implements IEntrant {
    private final String name;
    private final String surname;
    private final int age;
    private final double mathGrade;
    private final double englishGrade;

    public StudentImpl(String name, String surname, int age, double mathGrade, double englishGrade) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
    }

    public double getAverageGrade(){
        return (this.englishGrade + this.mathGrade) / 2;
    }

    @Override
    public String toString() {
        return "Student: " + surname + " " + name + ", " + age + " years old";
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public double getEnglishGrade() {
        return englishGrade;
    }
}
