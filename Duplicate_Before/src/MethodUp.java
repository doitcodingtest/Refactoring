public class MethodUp {
    public static void main(String[] args) {
        SMS sms = new SMS("010-123-1234", "Hello SMS");
        sms.send();
        System.out.println("---------------------------------------------");
        Email email = new Email("test@gmail.com", "Hello Email");
        email.send();
    }
}

class Sender {
    String receiver;
    String text;

    public Sender(String receiver, String text) {
        this.receiver = receiver;
        this.text = text;
    }
}

class SMS extends Sender {

    public SMS(String receiver, String text) {
        super(receiver, text);
    }

    void send() {
        System.out.println(receiver + "-> " + text);
        System.out.println("send Success");
    }
}

class Email extends Sender {

    public Email(String receiver, String text) {
        super(receiver, text);
    }

    void send() {
        System.out.println(receiver + "-> " + text);
        System.out.println("send Success");
    }
}
