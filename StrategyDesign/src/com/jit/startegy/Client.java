package com.jit.startegy;

import com.jit.startegy.product.Item;
import com.jit.startegy.product.ShopingCart;

public class Client {
    public static void main(String[] args) {
        ShopingCart cart= new ShopingCart();
        Item tv1= new Item("appleTV");
        Item tv2= new Item("SamsungTV");

        cart.addItem(tv1);
        cart.addItem(tv2);


        cart.pay(new OnlinePayment("myemail@example.com", "mypwd"));
        System.out.println("You paid:"+cart.calculateSum());



    }
}
