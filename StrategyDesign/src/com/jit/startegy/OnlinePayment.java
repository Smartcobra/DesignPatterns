package com.jit.startegy;

public class OnlinePayment implements Payment{
    private String id;
    private String password;

    public OnlinePayment(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public void pay(double amt) {
        System.out.println(" You paid through Online Payment");
    }
}
