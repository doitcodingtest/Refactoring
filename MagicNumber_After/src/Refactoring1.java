public class Refactoring1 {
    public static final int MIN_NICKNAME_LENGTH = 3;
    public static final int MAX_NICKNAME_LENGTH = 20;
    public static void main(String[] args) {
        String nickName = "TodayCoding";
        if (verificationNickName(nickName)) {
            System.out.println("사용할 수 있는 닉네임 입니다.");
        } else {
            System.out.println("사용할 수 없습니다");
        }
    }

    static boolean verificationNickName(String nickName) {
        if (nickName.length() < MAX_NICKNAME_LENGTH && nickName.length() > MIN_NICKNAME_LENGTH) {
            return true;
        }
        return false;
    }
}
