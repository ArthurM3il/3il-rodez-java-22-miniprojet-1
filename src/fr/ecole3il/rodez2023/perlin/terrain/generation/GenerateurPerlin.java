package fr.ecole3il.rodez2023.perlin.terrain.generation;

import fr.ecole3il.rodez2023.perlin.math.BruitPerlin2D;
import fr.ecole3il.rodez2023.perlin.terrain.MauvaiseValeurException;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;

public class GenerateurPerlin extends GenerateurCarte{
    public GenerateurPerlin(long graine) {
        super(graine);
    }

    @Override
    protected Terrain genererTerrain(int i, int j, int largeur, int hauteur) throws MauvaiseValeurException {
        BruitPerlin2D bruitPerlin = new BruitPerlin2D(this.getGraine(),1);
        double hydrometrie = bruitPerlin.bruit2D(0,0);
        double temperature = 2 * bruitPerlin.bruit2D(0,0);
        double altitude = 2 * temperature;

        return new Terrain(altitude,hydrometrie,temperature);

    }
}
