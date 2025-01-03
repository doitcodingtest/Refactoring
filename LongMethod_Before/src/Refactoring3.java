import com.google.gson.Gson;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Refactoring3 {
    public static void main(String[] args) {
        Contact contact = new Contact("한국 어딘가", "jk5020kim@naver.com", "010-123-1234");
        User user = new User("김하루", 38, "남자", contact);
        print(user, PrintType.Normal);
        print(user, PrintType.Json);
        print(user, PrintType.INFO);
    }

    private static void print(User user, PrintType printType) {
        switch (printType) {
            case Normal -> {
                System.out.println(user.toString());
            }
            case Json -> {
                Gson gson = new Gson();
                String jsonStr = gson.toJson(user);
                System.out.println(jsonStr);
            }
            case INFO -> {
                System.out.println("클래스 이름: " + user.getClass().getName());
                System.out.println("=========== 함수 목록 ===========");
                for (Method method : user.getClass().getMethods()) {
                    System.out.println(method.getName());
                }
                System.out.println("=========== 필드 목록 ===========");
                for (Field field : user.getClass().getFields()) {
                    System.out.println(field.getName());
                }
            }
        }
    }

    public enum PrintType {
        Normal, Json, INFO
    }
}

class Contact {
    public String address;
    public String email;
    public String phone;

    public Contact(String address, String email, String phone) {
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Refactoring3.Contact{" +
                "address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

class User {
    public String name;
    public int age;
    public String gender;
    public Contact contact;

    public User(String name, int age, String gender, Contact contact) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.contact = contact;
    }


    @Override
    public String toString() {
        return "Refactoring3.User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", contact=" + contact.toString() +
                '}';
    }
}

