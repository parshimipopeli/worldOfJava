package fr.parshimipopeli.monde;

import fr.parshimipopeli.entity.Personnage;

import java.util.Scanner;

public class Monde {

    public static  Personnage PersonnageFactory() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrez un nom de personnage");
        String nom = sc.nextLine();
        Personnage personnage = new Personnage(nom, 150, 10);

        return personnage;
    }

    public static void afficherInformation() {

        System.out.println(PersonnageFactory());
    }

}
