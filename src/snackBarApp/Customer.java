package snackBarApp;

public class Customer {

    private int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;

    //Getters and Setters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCashOnHand(){
        this.cashOnHand = cashOnHand;
    }

    public void addCash(int cash) {
        this.cashOnHand = cashOnHand + cash;
    }

    public void buySnacks(double TotalCost){
        this.cashOnHand = cashOnHand - totalCost;
    }
}