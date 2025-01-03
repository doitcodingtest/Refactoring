public class Refactoring1 {
    public static void main(String[] args) {
        Car car = new Car();
        Ship ship = new Ship();
        Airplane airplane = new Airplane();
    }
}
class Car {
    public Car() {
        printLog("자동차가 생성되었습니다.");
    }
    void printLog(String msg) {
        System.out.println(msg);
    }
}
class Ship {
    public Ship() {
        printLog("배가 생성되었습니다.");
    }
    void printLog(String msg) {
        System.out.println(msg);
    }
}
class Airplane {
    public Airplane() {
        printLog("비행기가 생성되었습니다.");
    }
    void printLog(String msg) {
        System.out.println(msg);
    }
}
