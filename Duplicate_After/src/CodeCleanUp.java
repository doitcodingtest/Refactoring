import java.util.*;

public class CodeCleanUp {
    public static void main(String[] args) {
        ArrayList<Menu>pizzaList = new ArrayList<>();
        pizzaList.add(new Menu("불고기피자", 12000));
        pizzaList.add(new Menu("치즈피자", 10000));
        pizzaList.add(new Menu("불고기피자", 12000));
        pizzaList.add(new Menu("스테이크피자", 16000));

        ArrayList<Menu>coffeeList = new ArrayList<>();
        coffeeList.add(new Menu("아메리카노", 3000));
        coffeeList.add(new Menu("아메리카노", 3000));
        coffeeList.add(new Menu("까페라떼", 3500));
        coffeeList.add(new Menu("까페모카", 3800));
        coffeeList.add(new Menu("까페라떼", 3500));
        coffeeList.add(new Menu("아메리카노", 3000));

        SaleSystem saleSystem = new SaleSystem(pizzaList, coffeeList);
        printSellPizzaMenu(saleSystem);
        System.out.println("-------------------------------");
        printSellCoffeeMenu(saleSystem);
    }

    //기준을 맞춘 코드
    static void printSellPizzaMenu(SaleSystem saleSystem){
        ArrayList<Menu>pizzaList = saleSystem.getPizzaList();
        Map<String, Integer> sellPizzaList = new HashMap<>();
        int totalAmount = 0;

        for(Menu pizza: pizzaList){
            String name = pizza.getName();
            int amount = pizza.getAmount();
            if(!sellPizzaList.containsKey(name)){
                sellPizzaList.put(name, 1);
            }else{
                int sellCount = sellPizzaList.get(name);
                sellPizzaList.put(name, sellCount+1);
            }
            totalAmount += amount;
        }
        sellPizzaList.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });
        System.out.println(totalAmount);
    }

    static void printSellCoffeeMenu(SaleSystem saleSystem){
        ArrayList<Menu>coffeeList = saleSystem.getCoffeeList();
        Map<String, Integer> sellCoffeeList = new HashMap<>();
        int totalAmount = 0;

        for(Menu coffee: coffeeList){
            String name = coffee.getName();
            int amount = coffee.getAmount();
            if(!sellCoffeeList.containsKey(name)){
                sellCoffeeList.put(name, 1);
            }else{
                int sellCount = sellCoffeeList.get(name);
                sellCoffeeList.put(name, sellCount+1);
            }
            totalAmount += amount;
        }
        sellCoffeeList.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });
        System.out.println(totalAmount);
    }
}

class SaleSystem{
    ArrayList<Menu> pizzaList;
    ArrayList<Menu> coffeeList;

    public SaleSystem(ArrayList<Menu> pizzaList, ArrayList<Menu> coffeeList) {
        this.pizzaList = pizzaList;
        this.coffeeList = coffeeList;
    }

    public ArrayList<Menu> getPizzaList() {
        return pizzaList;
    }

    public ArrayList<Menu> getCoffeeList() {
        return coffeeList;
    }
}

class Menu{
    private String name;
    private int amount;

    public Menu(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }
}