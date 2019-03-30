/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.pojo;

/**
 *
 * @author OLEE
 */
public class Summary {
    private int id;
    private int cardNo;
    private int onDays;
    private int offDays;
    private double bumping;

    public Summary(int id, int cardNo, int onDays, int offDays, double bumping) {
        this.id = id;
        this.cardNo = cardNo;
        this.onDays = onDays;
        this.offDays = offDays;
        this.bumping = bumping;
    }

    public Summary(int cardNo, int onDays, int offDays, double bumping) {
        this.cardNo = cardNo;
        this.onDays = onDays;
        this.offDays = offDays;
        this.bumping = bumping;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }

    public int getOnDays() {
        return onDays;
    }

    public void setOnDays(int onDays) {
        this.onDays = onDays;
    }

    public int getOffDays() {
        return offDays;
    }

    public void setOffDays(int offDays) {
        this.offDays = offDays;
    }

    public double getBumping() {
        return bumping;
    }

    public void setBumping(double bumping) {
        this.bumping = bumping;
    }
    
    
    
}
