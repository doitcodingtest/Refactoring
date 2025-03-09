public class Refactoring1 {
    public static void main(String[] args) {
        Payment card = new Card(500);
        card.pay();
        Payment samsungPay = new SamsungPay(700);
        samsungPay.pay();
        Payment accountTransfer = new AccountTransfer(1500);
        accountTransfer.pay();
    }
}

abstract class Payment {
    protected int amount;
    public Payment(int amount) {
        this.amount = amount;
    }
    public abstract void pay();
}

class Card extends Payment {
    public Card(int amount) {
        super(amount);
    }
    @Override
    public void pay() {
        System.out.println("신용카드로 " + this.amount + "원을 지불합니다.");
    }
}

class SamsungPay extends Payment {
    public SamsungPay(int amount) {
        super(amount);
    }
    @Override
    public void pay() {
        System.out.println("삼성페이로 " + this.amount + "원을 지불합니다.");
    }

}

class AccountTransfer extends Payment {
    public AccountTransfer(int amount) {
        super(amount);
    }
    @Override
    public void pay() {
        System.out.println("계좌이체로 " + this.amount + "원을 지불합니다.");
    }

}
