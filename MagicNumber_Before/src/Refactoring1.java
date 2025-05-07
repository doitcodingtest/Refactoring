public class Refactoring1 {
    public static void main(String[] args) {
        String nickName = "TodayCoding";
        if (isValidNickName(nickName)) {
            System.out.println("사용할 수 있는 닉네임 입니다.");
        } else {
            System.out.println("사용할 수 없습니다");
        }
    }

    static boolean isValidNickName(String nickName) {
        if (nickName.length() <= 20 && nickName.length() >= 3) {
            return true;
        }
        return false;
    }
}
