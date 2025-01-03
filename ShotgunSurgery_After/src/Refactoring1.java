public class Refactoring1 {
    public static void main(String[] args) {
        Car car = new Car();
        Ship ship = new Ship();
        Airplane airplane = new Airplane();
    }
}
class Car {
    Logger logger = new Logger();
    public Car() {
        logger.printLog("자동차가 생성되었습니다.");
    }
}

class Ship {
    Logger logger = new Logger();
    public Ship() {
        logger.printLog("배가 생성되었습니다.");
    }
}

class Airplane {
    Logger logger = new Logger();
    public Airplane() {
        logger.printLog("비행기가 생성되었습니다.");
    }
}

class Logger {
    void printLog(String msg) {
        System.out.println(msg);
    }
}