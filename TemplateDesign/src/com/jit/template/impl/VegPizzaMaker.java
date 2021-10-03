package com.jit.template.impl;

import com.jit.template.PizzaMaker;

public class VegPizzaMaker  extends PizzaMaker {
    @Override
    public void prepareIngredients() {
        System.out.println("Preparing mushroom, tomato slices, onions, and fresh basil leaves.");

    }

    @Override
    public void addToppings() {
        System.out.println("Adding mozzerella cheese and tomato sauce along with ingredients to crust.");
    }
}
