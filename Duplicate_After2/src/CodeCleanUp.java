import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

enum MenuType {
    PIZZA, COFFEE
}

public class CodeCleanUp {
    public static void main(String[] args) {
        ArrayList<Menu> pizzaList = new ArrayList<>();
        pizzaList.add(new Menu("불고기피자", 12000));
        pizzaList.add(new Menu("치즈피자", 10000));
        pizzaList.add(new Menu("불고기피자", 12000));
        pizzaList.add(new Menu("스테이크피자", 16000));

        ArrayList<Menu> coffeeList = new ArrayList<>();
        coffeeList.add(new Menu("아메리카노", 3000));
        coffeeList.add(new Menu("아메리카노", 3000));
        coffeeList.add(new Menu("까페라떼", 3500));
        coffeeList.add(new Menu("까페모카", 3800));
        coffeeList.add(new Menu("까페라떼", 3500));
        coffeeList.add(new Menu("아메리카노", 3000));

        SaleSystem saleSystem = new SaleSystem(pizzaList, coffeeList);
        saleSystem.printSellMenu(MenuType.PIZZA);
        System.out.println("-------------------------------");
        saleSystem.printSellMenu(MenuType.COFFEE);
    }

}

class SaleSystem {
    ArrayList<Menu> pizzaList;
    ArrayList<Menu> coffeeList;

    public SaleSystem(ArrayList<Menu> pizzaList, ArrayList<Menu> coffeeList) {
        this.pizzaList = pizzaList;
        this.coffeeList = coffeeList;
    }

    void printSellMenu(MenuType menuType) {
        Set<String> sellMenuSet = new HashSet<>();
        ArrayList<Menu> sellMenuList = new ArrayList<>();
        int total_Amount = 0;
        if (menuType == MenuType.COFFEE) {
            sellMenuList = (ArrayList<Menu>) coffeeList.clone();
        } else if (menuType == MenuType.PIZZA) {
            sellMenuList = (ArrayList<Menu>) pizzaList.clone();
        }
        for (Menu menu : sellMenuList) {
            sellMenuSet.add(menu.getName());
            total_Amount += menu.getAmount();
        }
        sellMenuSet.forEach(System.out::println);
        System.out.println(total_Amount);
    }
}

class Menu {
    private final String name;
    private final int amount;

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