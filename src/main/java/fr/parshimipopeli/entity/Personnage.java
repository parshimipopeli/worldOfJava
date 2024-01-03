package fr.parshimipopeli.entity;


public class Personnage extends AbstractCombatant {

    /**
     * Instancie un nouveau Personnage
     * @param Integer pointDeVie : les points de vie du monstre
     * @param Integer degat : les dégats que le monstre inflige
     * @param String nom : le nom du monstre
     */

    public Personnage(String nom, Integer pointDeVie, Integer degat) {
        super(nom, pointDeVie, degat);
    }
}
