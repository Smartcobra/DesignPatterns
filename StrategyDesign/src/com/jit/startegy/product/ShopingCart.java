package com.jit.startegy.product;

import com.jit.startegy.Payment;

import java.util.ArrayList;
import java.util.List;

public class ShopingCart {
    private List<Item> items;

    public ShopingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item){
        this.items.add(item);

    }

    public void removeItem(Item item){
        this.items.remove(item);

    }
    public  double calculateSum(){
        double sum=0;
        for (Item  item:items){
           sum= sum+item.getPrice(item.getName());
        }
        return sum;



    }
    public void pay(Payment payment){
        double amount=calculateSum();
        payment.pay(amount);
    }
}
