import java.util.ArrayList;

public class Refactoring2 {
    static ArrayList<Account> userList;

    public static void main(String[] args) {
        initUsers();
        Customer customer = new Customer("Kim", 60, false, true);
        if (validationAccount(customer)) {
            if (validationLoanEligibility(customer)) {
                System.out.println("대출이 가능합니다.");
            } else {
                System.out.println("대출이 불가능합니다.");
            }
        } else {
            System.out.println("계좌 상태 먼저를 확인하세요.");
        }
    }

    static boolean validationLoanEligibility(Customer customer) {
        return customer.creditScore > 50 && (customer.isHouseOwner || customer.hasJob);
    }

    static boolean validationAccount(Customer customer) {
        for (Account account : userList) {
            if (account.login.equals(customer.account)) {
                if (account.isActive) {
                    return true;
                }
            }
        }
        return false;
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
