package fr.ecole3il.rodez2023.perlin.terrain.carte;

import fr.ecole3il.rodez2023.perlin.terrain.MauvaiseValeurException;
import fr.ecole3il.rodez2023.perlin.terrain.TerrainInexistantException;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;
import fr.ecole3il.rodez2023.perlin.terrain.generation.GenerateurCarte;

public class Carte {
    private String nom;
    private int largeur;
    private int hauteur;
    private Terrain[][] carte;

    public Terrain getTerrain(int x, int y) throws TerrainInexistantException {
        if( x > largeur || y > hauteur) throw new TerrainInexistantException("Hors des zones du tableau");
        return carte[x][y];
    }

    public int getLargeur() {
        return largeur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public String getNom() {
        return nom;
    }

    public Carte(String nom, int largeur, int hauteur, GenerateurCarte generateurCarte) throws MauvaiseValeurException {
        this.nom = nom;
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.carte = generateurCarte.genererCarte(this.largeur, this.hauteur);
    }

    public Carte(String donneeCarte) throws MauvaiseValeurException {
        String[] donnee = donneeCarte.split("\n");
        this.nom = donnee[0];
        this.largeur = Integer.parseInt(donnee[1]);
        this.hauteur = Integer.parseInt(donnee[2]);

        //this.carte = new Terrain(Double.parseDouble(donnee[3].substring(0,3)),Double.parseDouble(donnee[3].substring(3,6)),Double.parseDouble(donnee[3].substring(6,9)));
    }
}
