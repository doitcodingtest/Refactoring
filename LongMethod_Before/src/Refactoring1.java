import java.util.ArrayList;

public class Refactoring1 {
    static ArrayList<Student>students;
    public static void main(String[] args) {
        students = new ArrayList<>();  // 학생 데이터를 초기화 하는 부분이 메인함수에 있음
        students.add(new Student(50));
        students.add(new Student(90));
        students.add(new Student(86));
        students.add(new Student(60));
        students.add(new Student(80));
        // 평균 변수를 구하기 위한 로직이 시작되는 부분
        int sum = 0;
        for(Student student : students){
            sum += student.score;
        }
        double average = sum/students.size();
        int myScore = 75;
        if(average < myScore){
            System.out.println("시험을 잘 본 편입니다.");
        }else{
            System.out.println("시험을 못 본 편입니다.");
        }
        
    }
}

class Student{
    int score;

    public Student(int score) {
        this.score = score;
    }
}
