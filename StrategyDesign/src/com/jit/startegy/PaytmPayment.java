package com.jit.startegy;

public class PaytmPayment implements Payment{

    private String username;
    private String password;
    private String otp;

    public PaytmPayment(String username, String password, String otp) {
        this.username = username;
        this.password = password;
        this.otp = otp;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public void pay(double amt) {
        System.out.println("Paid by Paytm");
    }
}

