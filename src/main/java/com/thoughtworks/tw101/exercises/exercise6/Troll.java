package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Marco on 2/13/2017.
 */
public class Troll implements Monster {
    private int hit_points = 40;
    private String name = "Troll";

    /**
     * Inflict damage upon a monster. Trolls take half damage
     * @param damage
     */
    @Override
    public void takeDamage(int damage) {
        if (damage/2 > hit_points){
            hit_points = 0;
        }
        else {
            hit_points -= (damage/2);
        }
    }

    @Override
    public void reportStatus() {
        System.out.println("Name: " + name + ",Hit Points: " + hit_points);
    }
}
