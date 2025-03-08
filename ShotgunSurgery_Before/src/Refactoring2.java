public class Refactoring2 {
    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo("김하루",20,"남","jk5020kim@naver.com","010-123-1234");
        User user = new User(userInfo);
        int tiketPrice = getMovieTicketPrice(user.getUserInfo().getAge());
        System.out.println(user.getUserInfo().getName()+"님의 티켓 가격은 "+tiketPrice+"원입니다.");
    }

    private static int getMovieTicketPrice(int age) {
        if(olderNineteenYear(age)){
            return 15000;
        }
        return 9000;
    }

    private static boolean olderNineteenYear(int age) {
        return age > 19;
    }
}

class User{
    UserInfo userInfo;

    public User(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }
}

class UserInfo{
    private String name;
    private int age;
    private String gender;
    private String email;
    private String phoneNumber;

    public UserInfo(String name, int age, String gender, String email, String phoneNumber) {
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