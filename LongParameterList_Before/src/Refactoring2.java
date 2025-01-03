public class Refactoring2 {
    public static void main(String[] args) {
        AirplaneSystem airplaneSystem = new AirplaneSystem();
        airplaneSystem.providedService(false);
        System.out.println("-------------------------");
        airplaneSystem.providedService(true);
    }
}

class AirplaneSystem{
    public void providedService(boolean isFirstClass){
        System.out.println("사전 좌석 지정 서비스");
        System.out.println("기내식 서비스");
        if(isFirstClass){
            System.out.println("전용 라운지 이용 서비스");
            System.out.println("마일리지 200% 적립 서비스");
        }
    }
}
     
