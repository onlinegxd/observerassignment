package com.lightspeed;

public class playerthree implements BombListener{
    @Override
    public void update(String alert) {
        System.out.println("It's over..." + alert);
    }
}
