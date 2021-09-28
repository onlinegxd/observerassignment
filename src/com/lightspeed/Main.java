package com.lightspeed;

public class Main {

    public static void main(String[] args) {
        PlantAlerter alert = new PlantAlerter();
        BombListener xxxkiller = new playerone();
        alert.al.subPlayer(xxxkiller);
        alert.al.subPlayer(new playertwo());
        alert.al.subPlayer(new playerthree());

        alert.setNewAlert("bomb has been planted");
        System.out.println("\n");
        alert.setNewAlert("bomb has been defused");

        alert.al.unsubPlayer(xxxkiller);
        System.out.println("\n");
        alert.setNewAlert("testalert");
    }
}