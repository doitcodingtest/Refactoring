import java.util.Arrays;

public class Refactoring1 {
    public static void main(String[] args) {
        Payment card = new Payment(500, "Card");
        card.setCreditCardNumber("1234-56-789");
        card.pay();

        Payment samsungPay = new Payment(700, "SamsungPay");
        samsungPay.setFingerprintData("XEX-OFE-37F-XTFR");
        samsungPay.setCreditCardNumber("1234-56-789");
        samsungPay.pay();

        Payment accountTransfer = new Payment(1500, "AccountTransfer");
        accountTransfer.setAccountNumber("123-45-789");
        accountTransfer.setTargetAccountNumber("987-654-231");
        accountTransfer.pay();
    }
}

class Payment {
    private final int amount;
    private final String paymentMethod;

    private String fingerprintData;
    private String creditCardNumber;
    private String accountNumber;
    private String targetAccountNumber;

    public Payment(int amount, String paymentMethod) {
        validatePaymentMethod(paymentMethod);
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public void setFingerprintData(String fingerprintData) {
        this.fingerprintData = fingerprintData;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setTargetAccountNumber(String targetAccountNumber) {
        this.targetAccountNumber = targetAccountNumber;
    }

    private void validatePaymentMethod(String paymentMethod) {
        String[] paymentList = {"Card", "SamsungPay", "AccountTransfer"};
        if (Arrays.stream(paymentList).filter(o -> o.equals(paymentMethod)).count() == 0) {
            throw new IllegalArgumentException(paymentMethod);
        }
    }

    private boolean validateCreditCardNumber() {
        if (this.creditCardNumber != null) {
            System.out.println("카드 유효성 검사를 수행합니다.");
            return true;
        }
        return false;
    }

    private boolean validateAccountNumber() {
        if (this.accountNumber != null && this.targetAccountNumber != null) {
            System.out.println("계좌 유효성 검사를 수행합니다.");
            return true;
        }
        return false;
    }

    private boolean validateFingerprintData() {
        if (this.fingerprintData != null) {
            System.out.println("지문 인증 데이터를 확인합니다.");
            return true;
        }
        return false;
    }

    void pay() {
        System.out.println("----------------------------------------------");
        System.out.println(this.paymentMethod + "결제 수단으로" + amount + "원을 지불합니다.");
        boolean isPaymentSuccessful = false;
        if (this.paymentMethod.equals("Card")) {
            if (validateCreditCardNumber()) {
                isPaymentSuccessful = true;
            }
        } else if (this.paymentMethod.equals("SamsungPay")) {
            if (validateFingerprintData()) {
                if (validateCreditCardNumber()) {
                    isPaymentSuccessful = true;
                }
            }
        } else if (this.paymentMethod.equals("AccountTransfer")) {
            if (validateAccountNumber()) {
                isPaymentSuccessful = true;
            }
        }
        if (isPaymentSuccessful) {
            System.out.println("결제가 완료되었습니다.");
        } else {
            System.out.println("결제가 실패되었습니다.");
        }
    }
}
