import java.util.ArrayList;

public class Refactoring1 {
    public static void main(String[] args) {
        Product milk = new Product("우유", 3000);
        Product snack = new Product("과자", 2000);
        Product apple = new Product("사과", 3500);
        Product jelly = new Product("젤리", 2500);

        ArrayList<Order> myFamilyOrders = new ArrayList<>();
        Order motherOrder = new Order(milk, 2);
        myFamilyOrders.add(motherOrder);
        Order motherOrder2 = new Order(apple, 6);
        myFamilyOrders.add(motherOrder2);
        Order fatherOrder = new Order(snack, 2);
        myFamilyOrders.add(fatherOrder);
        Order daughterOrder = new Order(snack, 3);
        myFamilyOrders.add(daughterOrder);
        Order daughterOrder2 = new Order(jelly, 2);
        myFamilyOrders.add(daughterOrder2);

        int totalPrice = getTotalPriceForOrders(myFamilyOrders, 1000, true);
        System.out.println("총 결재 금액은 " + totalPrice + "원 입니다.");
    }

    static int getTotalPriceForOrders(ArrayList<Order> orders, int deliverDistance, boolean isVIP) {
        int totalPrice = getAllOrderPrice(orders);
        int deliveryPrice = getDeliveryPrice(deliverDistance, totalPrice);
        int discountPrice = 0;
        if (isVIP) {
            discountPrice = vipDiscount(totalPrice + deliveryPrice);
        }
        return totalPrice + deliveryPrice - discountPrice;
    }

    private static int getAllOrderPrice(ArrayList<Order> orders) {
        int totalPrice = 0;
        for (Order order : orders) {
            totalPrice += order.getProduct().getPrice() * order.getQuantity();
        }
        System.out.println("총 상품 가격은 " + totalPrice + "원 입니다.");
        return totalPrice;
    }

    private static int getDeliveryPrice(int deliverDistance, int totalPrice) {
        int deliveryPrice = 0;
        if (totalPrice < 30000) {
            deliveryPrice += deliverDistance * 10;
            System.out.println("3만원 미만 주문으로 배송비 " + deliveryPrice + "원이 추가 됩니다.");
        }
        System.out.println("3만원 이상 주문으로 배송비는 무료입니다.");
        return deliveryPrice;
    }

    private static int vipDiscount(int price) {
        System.out.println("VIP등급으로 10%할인을 받았습니다.");
        return (int) (price * 0.1);
    }
}


class Order {
    private final Product product;
    private final int quantity;

    public Order(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}


class Product {
    private final String name;
    private final int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}