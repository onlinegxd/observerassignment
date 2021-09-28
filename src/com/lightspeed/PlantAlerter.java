package com.lightspeed;

public class PlantAlerter {
    public BombPlantAlerter al;

    public PlantAlerter(){
        al = new BombPlantAlerter();
    }

    public void setNewAlert(String event){
        al.bombAlert(event);
    }
}
