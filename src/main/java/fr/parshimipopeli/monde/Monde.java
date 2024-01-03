package fr.parshimipopeli.monde;

import fr.parshimipopeli.entity.Monstre;
import fr.parshimipopeli.entity.Personnage;

import java.util.Random;
import java.util.Scanner;

public class Monde {

    public static Personnage PersonnageFactory() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrez un nom de personnage");
        String nom = sc.nextLine();
        Personnage personnage = new Personnage(nom, 150, 10);
        afficherInformation();
        return personnage;
    };

    public static void afficherInformation() {
        System.out.println();
    };

    public static String[] debutNom = new String[] {
            "Chat", "Chien", "Chaton", "Ours"
    };

    public static String[] finNom = new String[] {
            "Mechant", "DeFeu", "DeLaMort", "Deglingo"
    };

    public static Monstre MonstreFactory() {

        String nomMonstre = debutNom[new Random().nextInt(debutNom.length)] + finNom[new Random().nextInt(finNom.length)];
        Monstre monstre = new Monstre(nomMonstre, 100, 10);

        return monstre;
    };

    public static void combat(Personnage personnage, Monstre monstre) {
        PersonnageFactory();
        MonstreFactory();
    };

}
