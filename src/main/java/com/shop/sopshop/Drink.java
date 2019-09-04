package com.shop.sopshop;

public class Drink {
    private int id;
    private String name;
    private String[] DRINK_NAMES = new String[] {"Cola", "Sprite", "Orange juice", "Grape juice", "M150", "RedBull"};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Drink(int id) {
        this.setName(id);;
    }

    public void setName(int number) {
        if (number < 0 || number >= this.DRINK_NAMES.length) {
            this.id = 0;
            this.name = DRINK_NAMES[this.id];
        } else {
            this.id = number;
            this.name = DRINK_NAMES[this.id];
        }
    }
}
