package controller.pojo;

import java.util.List;


public class Member {
    private int id;
    private PersonalInfo pInfo;
    private int cardNo;
    private List<String> monthAssigend;
    private List<Integer> offDays;
    private boolean membershipStaus;
    private String membershipType;
    private String creationDate;

    public Member(int id, PersonalInfo pInfo, int cardNo, List<String> monthAssigend, List<Integer> offDays, boolean membershipStaus, String membershipType, String creationDate) {
        this.id = id;
        this.pInfo = pInfo;
        this.cardNo = cardNo;
        this.monthAssigend = monthAssigend;
        this.offDays = offDays;
        this.membershipStaus = membershipStaus;
        this.membershipType = membershipType;
        this.creationDate = creationDate;
    }

    public Member(PersonalInfo pInfo, int cardNo, List<String> monthAssigend, List<Integer> offDays, boolean membershipStaus, String membershipType, String creationDate) {
        this.pInfo = pInfo;
        this.cardNo = cardNo;
        this.monthAssigend = monthAssigend;
        this.offDays = offDays;
        this.membershipStaus = membershipStaus;
        this.membershipType = membershipType;
        this.creationDate = creationDate;
    }
    
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PersonalInfo getpInfo() {
        return pInfo;
    }

    public void setpInfo(PersonalInfo pInfo) {
        this.pInfo = pInfo;
    }

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }

    public List<String> getMonthAssigend() {
        return monthAssigend;
    }

    public void setMonthAssigend(List<String> monthAssigend) {
        this.monthAssigend = monthAssigend;
    }

    public List<Integer> getOffDays() {
        return offDays;
    }

    public void setOffDays(List<Integer> offDays) {
        this.offDays = offDays;
    }

    public boolean isMembershipStaus() {
        return membershipStaus;
    }

    public void setMembershipStaus(boolean membershipStaus) {
        this.membershipStaus = membershipStaus;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
    
    
    
    
}
