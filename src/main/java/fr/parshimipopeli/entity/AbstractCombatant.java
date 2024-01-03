package fr.parshimipopeli.entity;

import java.util.StringJoiner;

abstract class AbstractCombatant {

    public String nom;
    public Integer pointDeVie;
    public Integer degat;

    public AbstractCombatant(String nom, Integer pointDeVie, Integer degat) {
        this.nom = nom;
        this.pointDeVie = pointDeVie;
        this.degat = degat;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", AbstractCombatant.class.getSimpleName() + "[", "]")
                .add("nom='" + nom + "'")
                .add("pointDeVie=" + pointDeVie)
                .add("degat=" + degat)
                .toString();
    }
}
