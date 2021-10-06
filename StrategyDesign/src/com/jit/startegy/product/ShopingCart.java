package com.jit.startegy.product;

import com.jit.startegy.Payment;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
       // double sum=0;
//        for (Item  item:items){
//           sum= sum+item.getPrice(item.getName);  //wrong why to pass same object as it is there.
//        }
        Optional<Double> sum = items.stream().
                map(Item::getPrice).reduce((a, b) -> a + b);

        return sum.get();

    }
    public void pay(Payment payment){
        double amount=calculateSum();
        payment.pay(amount);
    }
}
