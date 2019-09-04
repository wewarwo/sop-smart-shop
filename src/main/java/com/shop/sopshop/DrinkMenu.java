package com.shop.sopshop;

public class DrinkMenu {
    private String name;
    private String detail;
    private Drink[] drinks;

    public DrinkMenu(String name, String detail, Drink[] drinks, int price) {
        this.name = name;
        this.detail = detail;
        this.drinks = drinks;
        this.price = price;
    }

    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Drink[] getDrinks() {
        return drinks;
    }

    public void setDrinks(Drink[] drinks) {
        this.drinks = drinks;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
