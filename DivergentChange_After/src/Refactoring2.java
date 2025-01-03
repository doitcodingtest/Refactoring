public class Refactoring2 {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard();
        Monitor monitor = new Monitor();
        Mouse mouse = new Mouse();
        Computer computer = new Computer(keyboard, monitor, mouse);
        computer.getMonitor().TurnOn();
        computer.getMouse().checkBattery();
        computer.getKeyboard().setInputMode();
    }
}

class Computer {
    Monitor monitor;
    Mouse mouse;
    Keyboard keyboard;
    public Computer(Keyboard keyboard, Monitor monitor, Mouse mouse) {
        this.keyboard = keyboard;
        this.monitor = monitor;
        this.mouse = mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }
}
class Monitor {
    public void TurnOn() {
        System.out.println("모니터 전원을 켭니다.");
    }

    public void TurnOff() {
        System.out.println("모니터 전원을 끕니다.");
    }

    public void setMSleepMode() {
        System.out.println("모니터를 절전모드로 변경합니다.");
    }
}

class Mouse {
    public void checkBattery() {
        System.out.println("마우스 배터리를 확인합니다.");
    }

    public void setSensitivity() {
        System.out.println("마우스 감도를 설정합니다.");
    }
}

class Keyboard {
    public void setInputMode() {
        System.out.println("키보드 한영모드를 설정합니다.");
    }

    public void setCapsLock() {
        System.out.println("키보드 CapsLock을 설정합니다.");
    }

    public void setNumLock() {
        System.out.println("키보드 NumLock을 설정합니다.");
    }
}
