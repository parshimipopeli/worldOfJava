package fr.parshimipopeli;


import fr.parshimipopeli.monde.Monde;

public class Main {
    public static void main(String[] args) {

        Monde monde = new Monde();

        monde.PersonnageFactory();
        monde.afficherInformation();

    }
}