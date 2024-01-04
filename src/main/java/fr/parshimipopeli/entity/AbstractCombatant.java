package fr.parshimipopeli.entity;

import java.util.StringJoiner;

public abstract class AbstractCombatant {

    public String nom;
    public Integer pointDeVie;
    public Integer degat;

    public AbstractCombatant(String nom, Integer pointDeVie, Integer degat) {
        this.nom = nom;
        this.pointDeVie = pointDeVie;
        this.degat = degat;
    }

    public void attaquer(AbstractCombatant adversaire) {
        adversaire.defendre(this.degat);
        System.out.println(this.nom + " a attaqué " + adversaire.getNom() + " et lui a mis " + this.getDegat() + " de degats");
    }

    public void defendre(Integer degat) {
        this.pointDeVie -= degat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getPointDeVie() {
        return pointDeVie;
    }

    public void setPointDeVie(Integer pointDeVie) {
        this.pointDeVie = pointDeVie;
    }

    public Integer getDegat() {
        return degat;
    }

    public void setDegat(Integer degat) {
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
