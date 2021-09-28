package com.lightspeed;

public class playertwo implements BombListener{
    @Override
    public void update(String alert) {
        System.out.println("Definitely, " + alert);
    }
}
