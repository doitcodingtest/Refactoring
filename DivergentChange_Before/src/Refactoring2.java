public class Refactoring2 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.moniterTurnOn();
        computer.checkMouseBattery();
        computer.setKeyboardInputMode();
    }
}

class Computer {
    public void moniterTurnOn() {
        System.out.println("모니터 전원을 켭니다.");
    }

    public void moniterTurnOff() {
        System.out.println("모니터 전원을 끕니다.");
    }

    public void setMoniterSleepMode() {
        System.out.println("모니터를 절전모드로 변경합니다.");
    }

    public void checkMouseBattery() {
        System.out.println("마우스 배터리를 확인합니다.");
    }

    public void setMouseSensitivity() {
        System.out.println("마우스 감도를 설정합니다.");
    }

    public void setKeyboardInputMode() {
        System.out.println("키보드 한영모드를 설정합니다.");
    }

    public void setKeyboardCapsLock() {
        System.out.println("키보드 CapsLock을 설정합니다.");
    }

    public void setKeyboardNumLock() {
        System.out.println("키보드 NumLock을 설정합니다.");
    }
}
