public class Refactoring3 {
    public static void main(String[] args) {
        TravelInfo travelInfo = new TravelInfo(10,3,100,15,2);
        int totalPrice = travelInfo.getTravelExpenses();
        System.out.println("총 여행 경비는 "+totalPrice+"입니다.");
    }
}
class TravelInfo{
    int period;
    int peopleNumber;
    int airTicket;
    int accommodationFee;
    int mealCostAvg;

    public TravelInfo(int period, int peopleNumber, int airTicket, int accommodationFee, int mealCostAvg) {
        this.period = period;
        this.peopleNumber = peopleNumber;
        this.airTicket = airTicket;
        this.accommodationFee = accommodationFee;
        this.mealCostAvg = mealCostAvg;
    }

    int getTravelExpenses() {
        int totalPrice = 0;
        totalPrice += airTicket * peopleNumber;
        totalPrice += accommodationFee * period;
        totalPrice += mealCostAvg * 3 * period * peopleNumber;
        return totalPrice;
    }
}
