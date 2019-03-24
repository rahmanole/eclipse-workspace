package controller.pojo;


public class Manager {
    private int id;
    private int cardNo;
    private String monthNameWithYear;

    public Manager(int id, int cardNo, String monthNameWithYear) {
        this.id = id;
        this.cardNo = cardNo;
        this.monthNameWithYear = monthNameWithYear;
    }

    public Manager(int cardNo, String monthNameWithYear) {
        this.cardNo = cardNo;
        this.monthNameWithYear = monthNameWithYear;
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

    public String getMonthNameWithYear() {
        return monthNameWithYear;
    }

    public void setMonthNameWithYear(String monthNameWithYear) {
        this.monthNameWithYear = monthNameWithYear;
    }
    
    
    
    
}
