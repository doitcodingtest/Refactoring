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

    public DeliverySystem(int quantity, int productPrice, int kg) {
        this.quantity = quantity;
        this.productPrice = productPrice;
        this.kg = kg;
    }

    public double getTotalPrice(){
        int totalProductPrice =  productPrice * quantity;
        int discountLevel = 0;
        if(totalProductPrice > 100000) discountLevel = 3;
        else if(totalProductPrice > 50000 && kg < 10) discountLevel = 2;
        else if(totalProductPrice > 50000) discountLevel = 1;
        return applyDiscountForTotalPrice(totalProductPrice, discountLevel);
    }

    private double applyDiscountForTotalPrice(int totalProductPrice, int discountLevel) {
        if(discountLevel == 3) return totalProductPrice * 0.8;
        else if(discountLevel == 2) return totalProductPrice * 0.9;
        else if(discountLevel == 1) return totalProductPrice * 0.95;
        else return totalProductPrice;
    }
}
