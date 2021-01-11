package snackBarApp;

public class Main {
    public static void main(String[] args){
        Customer cust1 = new Customer("Jane", 45.25);
        Customer cust2 = new Customer("Bob", 33.14);

        vendingMachine vm1 = new vendingMachine("Food");
        vendingMachine vm2 = new vendingMachine("Drink");
        vendingMachine vm3 = new vendingMachine("Office");

        Snack food1 = new Snack("Chips", 36, 1.75, setVM_ID(vm1.getId()));
        Snack food2 = new Snack("Chocolate Bar", 36, 1.00, setVM_ID(vm1.getId()));
        Snack food3 = new Snack("Pretzel", 30, 2.00, setVM_ID(vm1.getId()));

        Snack drink1 = new Snack("Soda", 24, 2.50, setVM_ID(vm2.getId()));
        Snack drink2 = new Snack("Water", 20, 2.75, setVM_ID(vm2.getId()));

        //Jane Bought Soda
        drink1.reduceQuantity(3);
        cust1.buySnacks(drink1.getTotalCost(3));
        System.out.println(cust1.getCashOnHand());
        System.out.println(drink1.getQuantity());

        //Jane Bought Pretzel
        food3.reduceQuantity(1);
        cust1.buySnacks(food3.getTotalCost(1));
        System.out.println(cust1.getCashOnHand());
        System.out.println(food3.getQuantity());

        //Bob Bought Soda
        drink1.reduceQuantity(2);
        cust2.buySnacks(drink1.getTotalCost(2));
        System.out.println(cust2.getCashOnHand());
        System.out.println(drink1.getQuantity());

        //Jane Finds Cash
        cust1.addCash(10);
        System.out.println(cust1.getCashOnHand());

        //Jane Bought some more food
        food2.reduceQuantity(1);
        System.out.println(cust1.getCashOnHand())
        System.out.println(food2.getQuantity());

        //More Inventory
        food3.addQuantity(12);

        //Bob Bought some more food
        food3.reduceQuantity(3);
        cust2.buySnacks(food3.getTotalCost());
        System.out.println();

    }
}