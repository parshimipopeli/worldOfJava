package fr.parshimipopeli.monde;

import fr.parshimipopeli.entity.Personnage;

import java.util.Scanner;
import java.util.StringJoiner;

public class PersonnageFactory {



    public PersonnageFactory() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrez un nom de personnage");
        String nom = sc.nextLine();
        Personnage personnage = new Personnage(100, 15, nom);

        System.out.println(nom + " à " + personnage.getPointDeVie() + " points de vie et occasionne " + personnage.getDegat() + " points de dégat par coup porté");
        }

    }

