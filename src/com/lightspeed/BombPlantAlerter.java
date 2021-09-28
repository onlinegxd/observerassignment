package com.lightspeed;

import java.util.ArrayList;
import java.util.List;

public class BombPlantAlerter {
    List<BombListener> bombListeners;

    public BombPlantAlerter() {
        bombListeners = new ArrayList<>();
    }

    public void subPlayer(BombListener bombListener){
        bombListeners.add(bombListener);
    }

    public void unsubPlayer(BombListener bombListener){
        bombListeners.remove(bombListener);
    }

    public void bombAlert(String event) {
        for (BombListener h : bombListeners) {
            h.update(event);
        }
    }
}
