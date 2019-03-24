package controller.pojo;

import java.util.List;


public class Meal {
    private int id;
    private String date;
    List<Integer> offCards;
    private double actual_expensess;
    private double spent_expenss;
    private double balance;
    private String itemDetails;

    public Meal(int id, String date, List<Integer> offCards, double actual_expensess, double spent_expenss, double balance, String itemDetails) {
        this.id = id;
        this.date = date;
        this.offCards = offCards;
        this.actual_expensess = actual_expensess;
        this.spent_expenss = spent_expenss;
        this.balance = balance;
        this.itemDetails = itemDetails;
    }

    public Meal(String date, List<Integer> offCards, double actual_expensess, double spent_expenss, double balance, String itemDetails) {
        this.date = date;
        this.offCards = offCards;
        this.actual_expensess = actual_expensess;
        this.spent_expenss = spent_expenss;
        this.balance = balance;
        this.itemDetails = itemDetails;
    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Integer> getOffCards() {
        return offCards;
    }

    public void setOffCards(List<Integer> offCards) {
        this.offCards = offCards;
    }

    public double getActual_expensess() {
        return actual_expensess;
    }

    public void setActual_expensess(double actual_expensess) {
        this.actual_expensess = actual_expensess;
    }

    public double getSpent_expenss() {
        return spent_expenss;
    }

    public void setSpent_expenss(double spent_expenss) {
        this.spent_expenss = spent_expenss;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getItemDetails() {
        return itemDetails;
    }

    public void setItemDetails(String itemDetails) {
        this.itemDetails = itemDetails;
    }
    
    
    
}
     