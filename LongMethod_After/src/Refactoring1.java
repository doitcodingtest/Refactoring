import java.util.ArrayList;

public class Refactoring1 {
    static ArrayList<Student>students;
    public static void main(String[] args) {
        initStudents();
        int myScore = 75;
        if(getAverage() < myScore){
            System.out.println("시험을 잘 본 편입니다.");
        }else{
            System.out.println("시험을 못 본 편입니다.");
        }
    }

    static double getAverage(){
        int sum = 0;
        for(Student student : students){
            sum += student.score;
        }
        return sum/students.size();
    }

    static void initStudents() {
        students = new ArrayList<>();
        students.add(new Student(50));
        students.add(new Student(90));
        students.add(new Student(86));
        students.add(new Student(60));
        students.add(new Student(80));
    }
}

class Student{
    int score;

    public Student(int score) {
        this.score = score;
    }
}
