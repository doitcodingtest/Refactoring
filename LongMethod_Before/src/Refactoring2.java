import java.util.ArrayList;

public class Refactoring2 {
    static ArrayList<Account> userList;

    public static void main(String[] args) {
        initUsers();
        Customer customer = new Customer("Kim", 60, false, true);

        boolean existUser = false;  // 대출 심사 관련 로직 시작
        boolean isActive = false;
        for (Account account : userList) {
            if (account.login.equals(customer.account)) {
                existUser = true;
                isActive = account.isActive;
                break;
            }
        }
        if (existUser && isActive) {
            if (customer.creditScore > 50 && (customer.isHouseOwner || customer.hasJob)) {
                System.out.println("대출이 가능합니다.");
            } else {
                System.out.println("대출이 불가능합니다.");
            }
        } else {
            System.out.println("계좌 상태 먼저를 확인하세요.");
        }
    }

    static void initUsers() {
        userList = new ArrayList<>();
        userList.add(new Account("Lee", false));
        userList.add(new Account("Kim", true));
        userList.add(new Account("Park", true));
    }
}

class Customer {
    String account;
    int creditScore;
    boolean isHouseOwner;
    boolean hasJob;
    public Customer(String account, int creditScore, boolean isHouseOwner, boolean hasJob) {
        this.account = account;
        this.creditScore = creditScore;
        this.isHouseOwner = isHouseOwner;
        this.hasJob = hasJob;
    }

}

class Account {
    String login;
    boolean isActive;
    public Account(String login, boolean isActive) {
        this.login = login;
        this.isActive = isActive;
    }
}
