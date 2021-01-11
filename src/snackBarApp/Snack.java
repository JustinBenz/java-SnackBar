package snackBarApp;

public class Snack {
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int VM_ID;

    public Snack( String name, int quantity, double cost, int VM_ID ) {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.VM_ID = VM_ID;
    }

    //getters and senders
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getCost() {
        return cost;
    }

    public int getVM_ID() {
        return VM_ID;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setVM_ID(int VM_ID) {
        this.VM_ID = VM_ID;
    }

    public void addQuantity(int quantity){
        this.quantity = quantity += quantity;
    }

    public void buySnack(int quantity) {
        this.quantity = quantity - quantity;
    }

    public double getTotalCost(int quantity){
        double totalCost = this.cost * quantity;
        return totalCost;
    }
}