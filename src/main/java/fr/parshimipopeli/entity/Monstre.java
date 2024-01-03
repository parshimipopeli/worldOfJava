package fr.parshimipopeli.entity;

import java.util.StringJoiner;

public class Monstre extends AbstractCombatant {

    /**
     * Instancie un nouveau monstre
     * @param Integer pointDeVie : les points de vie du monstre
     * @param Integer degat : les dégats que le monstre inflige
     * @param String nom : le nom du monstre
     */
    public Monstre( String nom, Integer pointDeVie, Integer degat) {

        super(nom, pointDeVie, degat);
    }
}
