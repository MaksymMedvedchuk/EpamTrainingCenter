package chapter6.task2;

public class Runner {
    public static void main(String[] args) {

        AbsenteeStudent absenteeStudent = new AbsenteeStudent("Maksim", "Medvedchyk", 33, 10.2, 7.3);
        System.out.println(absenteeStudent);
        absenteeStudent.passExam(7);
        System.out.println();
        absenteeStudent.chooseSpecialty(absenteeStudent.getMathGrade(), absenteeStudent.getMathGrade());
    }
}
