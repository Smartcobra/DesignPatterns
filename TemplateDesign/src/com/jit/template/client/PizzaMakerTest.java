package com.jit.template.client;

import com.jit.template.PizzaMaker;
import com.jit.template.impl.InHouseAssortedPizzaMaker;
import com.jit.template.impl.NonVegPizzaMaker;
import com.jit.template.impl.TakeWayPizzaMaker;
import com.jit.template.impl.VegPizzaMaker;
import org.junit.Test;

public class PizzaMakerTest {
        @Test
        public void testMakePizza() throws Exception {
            System.out.println("-----Making Veg Pizza-----");
            PizzaMaker vegPizzaMaker = new VegPizzaMaker();
            vegPizzaMaker.makePizza();

            System.out.println("-----Making Non Veg Pizza-----");
            PizzaMaker nonVegPizzaMaker = new NonVegPizzaMaker();
            nonVegPizzaMaker.makePizza();

            System.out.println("-----Making In-House Assorted Pizza-----");
            PizzaMaker inHouseAssortedPizzaMaker = new InHouseAssortedPizzaMaker();
            inHouseAssortedPizzaMaker.makePizza();

            System.out.println("-----Making TakeAway  Pizza-----");
            PizzaMaker teakAway = new TakeWayPizzaMaker();
            inHouseAssortedPizzaMaker.makePizza();
        }
}
