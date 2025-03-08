public class Refactoring2 {
    public static void main(String[] args) {

        User user = new User("김하루", 20, "남", "jk5020kim@naver.com", "010-123-1234");
        int tiketPrice = getMovieTicketPrice(user.getAge());
        System.out.println(user.getName() + " 님의 티켓 가격은 " + tiketPrice + "원입니다.");
    }

    private static int getMovieTicketPrice(int age) {
        if (age > 19) { // 상수화하는 것을 추천
            return 15000;
        }
        return 9000;
    }
}

class User {
    private final String name;
    private final int age;
    private final String gender;
    private final String email;
    private final String phoneNumber;

    public User(String name, int age, String gender, String email, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
