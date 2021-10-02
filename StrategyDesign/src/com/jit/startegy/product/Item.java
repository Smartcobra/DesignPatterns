package com.jit.startegy.product;

public class Item {
    private String id;
    private String name;
    private double price;
    private PriceChart priceChart;


    public Item( String name) {
        this.name = name;
    }

    public double getPrice(String name) {
        priceChart = new PriceChart();
        return price=priceChart.getPrice(name);
    }

   public String getName(){
        return this.name;
   }

}
