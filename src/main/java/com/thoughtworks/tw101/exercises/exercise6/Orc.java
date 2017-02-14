package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Marco on 2/13/2017.
 */
public class Orc implements Monster {
    private int hit_points = 20;
    private String name = "Orc";

    /**
     * Inflict damage upon an orc. Orcs take full damage
     * @param damage
     */
    @Override
    public void takeDamage(int damage) {
        if (damage > hit_points){
            hit_points = 0;
        }
        else {
            hit_points -= damage;
        }
    }

    @Override
    public void reportStatus() {
        System.out.println("Name: " + name + ",Hit Points: " + hit_points);
    }
}
