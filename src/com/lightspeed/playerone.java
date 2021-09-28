package com.lightspeed;

public class playerone implements BombListener {
    @Override
    public void update(String alert) {
        System.out.println("Did you hear that? I predict that " + alert);
    }
}
