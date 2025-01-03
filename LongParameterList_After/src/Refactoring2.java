public class Refactoring2 {
    public static void main(String[] args) {
        AirplaneSystem airplaneSystem = new AirplaneSystem();
        airplaneSystem.providedServiceForNormal();
        System.out.println("-------------------------");
        airplaneSystem.providedServiceForFirstClass();
    }
}

class AirplaneSystem{
    public void providedServiceForNormal(){
        System.out.println("사전 좌석 지정 서비스");
        System.out.println("기내식 서비스");
    }

    public void providedServiceForFirstClass(){
        providedServiceForNormal();
        System.out.println("전용 라운지 이용 서비스");
        System.out.println("마일리지 200% 적립 서비스");
    }
}
     
