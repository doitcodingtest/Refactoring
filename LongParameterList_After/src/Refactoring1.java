public class Refactoring1 {
    public static void main(String[] args) {
        DeliverySystem deliverySystem = new DeliverySystem(10,6000,8);
        double totalPrice = deliverySystem.getTotalPrice();
        System.out.println("총 금액은 "+totalPrice+"원입니다.");
    }
}

class DeliverySystem{
    private int quantity;
    private int productPrice;
    private int kg;

    private final double discountRateForLevel[] = {1.0, 0.95, 0.9, 0.8};

    public DeliverySystem(int quantity, int productPrice, int kg) {
        this.quantity = quantity;
        this.productPrice = productPrice;
        this.kg = kg;
    }

    public double getTotalPrice(){
        int totalProductPrice =  productPrice * quantity;
        return applyDiscountForTotalPrice(totalProductPrice);
    }

    private int getDiscountLevel(int totalProductPrice) {
        int discountLevel = 0;
        if(totalProductPrice > 100000) discountLevel = 3;
        else if(totalProductPrice > 50000 && kg < 10) discountLevel = 2;
        else if(totalProductPrice > 50000) discountLevel = 1;
        return discountLevel;
    }

    private double applyDiscountForTotalPrice(int totalProductPrice) {
        int discountLevel = getDiscountLevel(totalProductPrice);
        return totalProductPrice * discountRateForLevel[discountLevel];
    }
}
