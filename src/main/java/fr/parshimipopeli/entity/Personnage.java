package fr.parshimipopeli.entity;

import java.util.StringJoiner;

public class Personnage {

    private Integer pointDeVie;
    private Integer degat;
    private String nom;

    public Personnage(Integer pointDeVie, Integer degat, String nom) {
        this.pointDeVie = pointDeVie;
        this.degat = degat;
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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Personnage.class.getSimpleName() + "[", "]")
                .add("pointDeVie=" + pointDeVie)
                .add("degat=" + degat)
                .add("nom='" + nom + "'")
                .toString();
    }
}
