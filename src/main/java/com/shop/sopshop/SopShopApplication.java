package com.shop.sopshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@SpringBootApplication
public class SopShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(SopShopApplication.class, args);
    }
    public ArrayList<DrinkMenu> cart = new ArrayList<>();
    public int cost = 0;

    @RequestMapping("/")
    String home(){
        return "Drinks Shop\n/menu to browse menu.\n/menu/{id} to view menu.\n/menu/{id}/add to add menu to cart.\n/checkout to checkout.\n/clear to clear cart.";
    }

    @RequestMapping("/menu")
    DrinkMenu[] viewMenuList(){
        return DrinkMenuFactory.getDrinkMenuList();
    }

    @RequestMapping("/menu/{id}")
    DrinkMenu viewMenu(@PathVariable int id){
        return DrinkMenuFactory.getDrinkMenu(id);
    }

    @RequestMapping({"/menu/{id}/add"})
    String addToCart(@PathVariable int id) {
        if (id < 0 || id > DrinkMenuFactory.getDrinkMenuList().length) {
            return "menu is unavailable.";
        }
        cart.add(DrinkMenuFactory.getDrinkMenu(id));
        cost += DrinkMenuFactory.getDrinkMenu(id).getPrice();
        return DrinkMenuFactory.getDrinkMenu(id).getName() + " added to your cart.\nTotal cost:" + cost;
    }

    @RequestMapping({"/clear"})
    String clear() {
        cost = 0;
        cart.clear();
        return "Cart is cleared!";
    }

    @RequestMapping({"/checkout"})
    String checkout() {
        int total = 0;
        for (DrinkMenu c:
             cart) {
                total += c.getPrice();
        }
        cost = 0;
        cart.clear();
        return "Total: " + total + " baht\nThank you...";
    }

}
