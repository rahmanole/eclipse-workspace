/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.pojo;

import java.sql.Date;
import java.util.List;

public class MonthDetails {

    private int id;
    private String monthName;
    private String year;
    private double employee_fees;
    private int totalDays;
    private int totalFridays;
    private double friDayMealRate;
    private int numberOfNormalDaymeals;
    private double normalMealRate;
    private double feastMealRate;
    private Date feastDate;
    private List<Integer> cardNoList;

    public MonthDetails(String monthName, String year, double employee_fees, int totalDays, int totalFridays, double friDayMealRate, int numberOfNormalDaymeals, double normalMealRate, double feastMealRate, Date feastDate) {
        this.monthName = monthName;
        this.year = year;
        this.employee_fees = employee_fees;
        this.totalDays = totalDays;
        this.totalFridays = totalFridays;
        this.friDayMealRate = friDayMealRate;
        this.numberOfNormalDaymeals = numberOfNormalDaymeals;
        this.normalMealRate = normalMealRate;
        this.feastMealRate = feastMealRate;
        this.feastDate = feastDate;
    }
    
    public MonthDetails(int id, String monthName, String year, double employee_fees, int totalDays, int totalFridays, double friDayMealRate, int numberOfNormalDaymeals, double normalMealRate, double feastMealRate, Date feastDate) {
        this.id = id;
        this.monthName = monthName;
        this.year = year;
        this.employee_fees = employee_fees;
        this.totalDays = totalDays;
        this.totalFridays = totalFridays;
        this.friDayMealRate = friDayMealRate;
        this.numberOfNormalDaymeals = numberOfNormalDaymeals;
        this.normalMealRate = normalMealRate;
        this.feastMealRate = feastMealRate;
        this.feastDate = feastDate;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getEmployee_fees() {
        return employee_fees;
    }

    public void setEmployee_fees(double employee_fees) {
        this.employee_fees = employee_fees;
    }

    public int getTotalDays() {
        return totalDays;
    }

    public void setTotalDays(int totalDays) {
        this.totalDays = totalDays;
    }

    public int getTotalFridays() {
        return totalFridays;
    }

    public void setTotalFridays(int totalFridays) {
        this.totalFridays = totalFridays;
    }

    public double getFriDayMealRate() {
        return friDayMealRate;
    }

    public void setFriDayMealRate(double friDayMealRate) {
        this.friDayMealRate = friDayMealRate;
    }

    public int getNumberOfNormalDaymeals() {
        return numberOfNormalDaymeals;
    }

    public void setNumberOfNormalDaymeals(int numberOfNormalDaymeals) {
        this.numberOfNormalDaymeals = numberOfNormalDaymeals;
    }

    public double getNormalMealRate() {
        return normalMealRate;
    }

    public void setNormalMealRate(double normalMealRate) {
        this.normalMealRate = normalMealRate;
    }

    public double getFeastMealRate() {
        return feastMealRate;
    }

    public void setFeastMealRate(double feastMealRate) {
        this.feastMealRate = feastMealRate;
    }

    public Date getFeastDate() {
        return feastDate;
    }

    public void setFeastDate(Date feastDate) {
        this.feastDate = feastDate;
    }

    public List<Integer> getCardNoList() {
        return cardNoList;
    }

    public void setCardNoList(List<Integer> cardNoList) {
        this.cardNoList = cardNoList;
    }

    
    
    


    

    
    
    
    

}
