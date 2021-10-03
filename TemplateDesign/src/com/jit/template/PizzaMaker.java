package com.jit.template;

public abstract class PizzaMaker {

    public void makePizza(){
        preparePizzaDough();
        prepareBakeCrust();
        prepareIngredients();
        addToppings();
        if(customerWantsPackedPizza()){
            packPizza();
        }

    }

    public void packPizza() {
        System.out.println("Packing Pizza in Packing box");
    }

    public boolean customerWantsPackedPizza() {
        return true;
    }

    final void prepareBakeCrust() {
        System.out.println("Pre baking crust at 325 F for 3 minutes.");
    }

    public abstract void prepareIngredients();

   public abstract void addToppings();

    final void preparePizzaDough() {
        System.out.println("Preparing pizza dough with plain flour, dried yeast, caster sugar, salt, olive oil, and warm water.");
    }
}
