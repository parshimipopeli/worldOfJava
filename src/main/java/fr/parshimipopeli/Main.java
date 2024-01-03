package fr.parshimipopeli;


import fr.parshimipopeli.entity.Monstre;
import fr.parshimipopeli.entity.Personnage;
import fr.parshimipopeli.monde.Monde;

public class Main {
    public static void main(String[] args) {


        Monde monde = new Monde();
        Monde.combat(Monde.PersonnageFactory(), Monde.MonstreFactory());



    };
}