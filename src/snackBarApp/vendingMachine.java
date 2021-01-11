package snackBarApp;

public class vendingMachine {
    private static int maxId = 0;
    private int id;
    private String name;
    public vendingMachine ( String name ) {
        maxId++;
        id = maxId;
        this.name = name;
    }

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
}