public class ExtractMethod {
    public static void main(String[] args) {
        sendSMS("0101231234", "Hello SMS");
        System.out.println("----------------------------------");
        sendEmail("test@gmail.com", "Hello Email");
    }
    public static void sendSMS(String phoneNumber, String text){
        if(checkPhoneNumber(phoneNumber)){
            Send(phoneNumber, text);
        }
    }

    public static void sendEmail(String email, String text){
        if(chekcEmail(email)){
            Send(email, text);
        }
    }

    private static void Send(String receiver, String text) {
        if(SendMessage(text)){
            System.out.println(receiver + " send Success");
        }
    }

    private static boolean chekcEmail(String email) {
        return true;
    }

    private static boolean SendMessage(String text) {
        System.out.println(text);
        return true;
    }

    private static boolean checkPhoneNumber(String phoneNumber) {
        return true;
    }
}
