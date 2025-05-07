public class Refactoring1 {
    public static void main(String[] args) {
        Payment card = new Card(500, "1234-56-789");
        card.pay();
        Payment samsungPay = new SamsungPay(700, "XEX-OFE-37F-XTFR", "1234-56-789");
        samsungPay.pay();
        Payment accountTransfer = new AccountTransfer(1500, "123-45-789", "987-654-231");
        accountTransfer.pay();
    }
}

abstract class Payment {
    protected int amount;
    boolean isPaymentSuccessful;
    public Payment(int amount) {
        this.amount = amount;
        this.isPaymentSuccessful = false;
    }
    public abstract void pay();
    protected void printPayResult(){
        if (isPaymentSuccessful) {
            System.out.println("결제가 완료되었습니다.");
        } else {
            System.out.println("결제가 실패되었습니다.");
        }
    }
}

class Card extends Payment {
    private String creditCardNumber;

    public Card(int amount, String creditCardNumber) {
        super(amount);
        this.creditCardNumber = creditCardNumber;
    }

    protected boolean validateCreditCardNumber() {
        if (this.creditCardNumber != null) {
            System.out.println("카드 유효성 검사를 수행합니다.");
            return true;
        }
        return false;
    }

    @Override
    public void pay() {
        System.out.println("----------------------------------------------");
        System.out.println("신용카드로" + amount + "원을 지불합니다.");
        if (validateCreditCardNumber()) {
            isPaymentSuccessful = true;
        }
        printPayResult();
    }
}

class SamsungPay extends Card {
    private String fingerprintData;

    public SamsungPay(int amount, String creditCardNumber, String fingerprintData) {
        super(amount, creditCardNumber);
        this.fingerprintData = fingerprintData;
    }
    private boolean validateFingerprintData() {
        if (this.fingerprintData != null) {
            System.out.println("지문 인증 데이터를 확인합니다.");
            return true;
        }
        return false;
    }
    @Override
    public void pay() {
        System.out.println("----------------------------------------------");
        System.out.println("삼성페이로" + amount + "원을 지불합니다.");
        if (validateFingerprintData()) {
            if (validateCreditCardNumber()) {
                isPaymentSuccessful = true;
            }
        }
        printPayResult();
    }

}

class AccountTransfer extends Payment {
    private String accountNumber;
    private String targetAccountNumber;
    public AccountTransfer(int amount, String accountNumber, String targetAccountNumber) {
        super(amount);
        this.accountNumber = accountNumber;
        this.targetAccountNumber = targetAccountNumber;
    }
    private boolean validateAccountNumber() {
        if (this.accountNumber != null && this.targetAccountNumber != null) {
            System.out.println("계좌 유효성 검사를 수행합니다.");
            return true;
        }
        return false;
    }

    @Override
    public void pay() {
        System.out.println("----------------------------------------------");
        System.out.println("계좌이체로" + amount + "원을 지불합니다.");
        if (validateAccountNumber()) {
            isPaymentSuccessful = true;
        }
        printPayResult();
    }

}
