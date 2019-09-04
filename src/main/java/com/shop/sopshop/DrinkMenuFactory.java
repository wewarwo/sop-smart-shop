package com.shop.sopshop;

public class DrinkMenuFactory {
    public static final DrinkMenu[] drinkMenus = new DrinkMenu[] {
            new DrinkMenu("SodaLover", "A couple of soda can.", new Drink[]{new Drink(0), new Drink(1)}, 100),
            new DrinkMenu("JuiceSet", "Juice, good for your health.", new Drink[]{new Drink(2), new Drink(3)}, 150),
            new DrinkMenu("EnergyDrink", "Energy for you.", new Drink[]{new Drink(4), new Drink(5)}, 200),
            new DrinkMenu("JustGiveMeAllOfThat", "Get all we got.", new Drink[]{new Drink(0), new Drink(1), new Drink(2), new Drink(3), new Drink(4)}, 400)
    };

    public static DrinkMenu getDrinkMenu(int menu) {
        return drinkMenus[menu];
    }

    public static DrinkMenu[] getDrinkMenuList() {
        return drinkMenus;
    }
}
