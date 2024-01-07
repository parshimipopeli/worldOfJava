package fr.parshimipopeli.monde;

import fr.parshimipopeli.entity.AbstractCombatant;
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
        afficherInformation(personnage);
        return personnage;
    }

    ;

    public static void afficherInformation(AbstractCombatant p) {
        System.out.println(p);
    }

    ;

    public static String[] debutNom = new String[]{
            "Chat", "Chien", "Chaton", "Ours"
    };

    public static String[] finNom = new String[]{
            "Mechant", "DeFeu", "DeLaMort", "Deglingo"
    };

    public static Monstre MonstreFactory() {

        String nomMonstre = debutNom[new Random().nextInt(debutNom.length)] + finNom[new Random().nextInt(finNom.length)];
        Monstre monstre = new Monstre(nomMonstre, 100, 10);
        afficherInformation(monstre);
        return monstre;
    }

    ;

    public static void combat(Personnage personnage, Monstre monstre) {
        afficherInformation(personnage);
        afficherInformation(monstre);
        boolean turn;
        while (personnage.pointDeVie > 0 && monstre.pointDeVie > 0) {
            turn = new Random().nextBoolean();
            if (turn) {
                personnage.attaquer(monstre);
                System.out.println(monstre.getNom() + " a " + monstre.getPointDeVie() + " point de vies");
                System.out.println("***********************************************************");
                int millis = 5000;

                try {
                    Thread.sleep(millis);
                } catch (InterruptedException ie) {
                    // ...
                }
            } else {
                monstre.attaquer(personnage);
                System.out.println(personnage.getNom() + " a " + personnage.getPointDeVie() + " point de vies");
                System.out.println("***********************************************************");
                int millis = 5000;

                try {
                    Thread.sleep(millis);
                } catch (InterruptedException ie) {
                    // ...
                }
            }

        }
        System.out.println("vainqueur: " + (personnage.pointDeVie > 0 ? personnage : monstre));
    }
};


