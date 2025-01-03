public class Refactoring1 {
    public static void main(String[] args) {
        CommonExpenses commonExpenses = new CommonExpenses(185,50,20,150);
        ChildrenExpense childrenExpense = new ChildrenExpense(10,50);
        HouseholdBook householdBook = new HouseholdBook(commonExpenses, childrenExpense);
        System.out.println("이번달 총 소비 금액은 "+ householdBook.getTotalPrice() + "만원 입니다.");
    }
}

class HouseholdBook{
    CommonExpenses commonExpenses;
    ChildrenExpense childrenExpense;

    public HouseholdBook(CommonExpenses commonExpenses, ChildrenExpense childrenExpense) {
        this.commonExpenses = commonExpenses;
        this.childrenExpense = childrenExpense;
    }

    public int getTotalPrice(){
        return commonExpenses.getHouseRent() + commonExpenses.getTax() +
                commonExpenses.getCarGas() + commonExpenses.getFood() +
                childrenExpense.getEducation() + childrenExpense.getPocketMoney();
    }
}


class CommonExpenses{
    private  int houseRent;
    private  int tax;
    private  int carGas;
    private  int food;

    public CommonExpenses(int houseRent, int tax, int carGas, int food) {
        this.houseRent = houseRent;
        this.tax = tax;
        this.carGas = carGas;
        this.food = food;
    }

    public int getHouseRent() {
        return houseRent;
    }

    public int getTax() {
        return tax;
    }

    public int getCarGas() {
        return carGas;
    }

    public int getFood() {
        return food;
    }
}

class ChildrenExpense{
    private int education;
    private int pocketMoney;

    public ChildrenExpense(int education, int pocketMoney) {
        this.education = education;
        this.pocketMoney = pocketMoney;
    }

    public int getEducation() {
        return education;
    }

    public int getPocketMoney() {
        return pocketMoney;
    }
}