import java.util.Arrays;

public class Refactoring1 {
    public static void main(String[] args) {
        Payment card = new Payment(500, "Card");
        card.pay();
        Payment samsungPay = new Payment(700, "SamsungPay");
        samsungPay.pay();
        Payment accountTransfer = new Payment(1500, "AccountTransfer");
        accountTransfer.pay();
    }
}

class Payment {
    private final int amount;
    private final String paymentMethod;

    public Payment(int amount, String paymentMethod) {
        validatePaymentMethod(paymentMethod);
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    private void validatePaymentMethod(String paymentMethod) {
        String[] paymentList = {"Card", "SamsungPay", "AccountTransfer"};
        if (Arrays.stream(paymentList).filter(o -> o.equals(paymentMethod)).count() == 0) {
            throw new IllegalArgumentException(paymentMethod);
        }
    }

    void pay() {
        if (this.paymentMethod.equals("Card")) {
            System.out.println("신용카드로 " + amount + "원을 지불합니다.");
        } else if (this.paymentMethod.equals("SamsungPay")) {
            System.out.println("삼성페이로 " + amount + "원을 지불합니다.");
        } else if (this.paymentMethod.equals("AccountTransfer")) {
            System.out.println("계좌이체로 " + amount + "원을 지불합니다.");
        }
    }
}
