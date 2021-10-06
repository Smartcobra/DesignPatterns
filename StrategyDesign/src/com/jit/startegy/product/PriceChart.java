package com.jit.startegy.product;

import java.util.HashMap;
import java.util.Map;

public class PriceChart {
    private String name;
    private double price;
    private static final  Map<String, Double> priceChart;

   public PriceChart(){

   }

   //singleton
    static {
        priceChart= new HashMap<String, Double>();

        priceChart.put("appleTV",23.67);
        priceChart.put("SamsungTV",12.30);
        priceChart.put("miTV",10.34);
        priceChart.put("onePlusTv",14.67);
        priceChart.put("panasonicTv",7.20);
        priceChart.put("onidaTv",3.98);

    }

    public double getPrice(String name) {
        return priceChart.get(name);
    }
}
