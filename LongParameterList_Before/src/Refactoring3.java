public class Refactoring3 {
    public static void main(String[] args) {
        int totalPrice = getTravelExpenses(10,3,100,15,2);
        System.out.println("총 여행 경비는 "+totalPrice+"입니다.");
    }

    static int getTravelExpenses(int period, int peopleNumber, int airTicket, int accommodationFee, int mealCostAvg){
        int totalPrice = 0;
        totalPrice += airTicket * peopleNumber;
        totalPrice += accommodationFee * period;
        totalPrice += mealCostAvg * 3 * period * peopleNumber;
        return totalPrice;
    }

}
