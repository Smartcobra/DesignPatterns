package com.jit.startegy;

public class CreditCardPayment implements Payment{

    private String nameOnCreditCard;
    private String cardNo;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardPayment(String nameOnCreditCard, String cardNo, String cvv, String dateOfExpiry) {
        this.nameOnCreditCard = nameOnCreditCard;
        this.cardNo = cardNo;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    public String getNameOnCreditCard() {
        return nameOnCreditCard;
    }

    public String getCardNo() {
        return cardNo;
    }

    public String getCvv() {
        return cvv;
    }

    public String getDateOfExpiry() {
        return dateOfExpiry;
    }

    @Override
    public void pay(double amt) {
        System.out.println("Paid with Credit card");
    }



}
