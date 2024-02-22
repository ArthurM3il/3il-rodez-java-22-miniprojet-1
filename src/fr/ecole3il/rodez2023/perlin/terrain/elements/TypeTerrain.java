package fr.ecole3il.rodez2023.perlin.terrain.elements;
import fr.ecole3il.rodez2023.perlin.Utils;

import java.awt.image.BufferedImage;

public enum TypeTerrain{
    COLLINES("hills.png"),
    DESERT("desert.png"),
    FORET_CONIFÈRES("coniferous_forest.png"),
    FORET_FEUILLUS("deciduous_forest.png"),
    MARAIS("marsh.png"),
    MONTAGNE("mountain.png"),
    OCEAN("ocean.png"),
    PLAINE("plain.png"),
    TOUNDRA("tundra.png");

    private String nom;

    TypeTerrain(String nom){
        this.nom = nom;
    }
    public BufferedImage getImage(){
        return Utils.chargerTuile(nom);
    }


    /**
     * Override de toString retournant le nom de l'enum moins l'extension
     * @return
     */
    @Override
    public String toString(){
        return nom.substring(0, nom.length() - 4);
    }
}