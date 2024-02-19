package fr.ecole3il.rodez2023.perlin.terrain.elements;

import fr.ecole3il.rodez2023.perlin.terrain.MauvaiseValeurException;

public class Terrain {
    private double altitude;
    private double hydrometrie;
    private double temperature;

    public Terrain(double altitude, double hydrometrie, double temperature) throws MauvaiseValeurException {
    if(hydrometrie < 0 || hydrometrie > 1) throw new MauvaiseValeurException("L'hydrometrie doit être comprise entre 0 et 1");
    this.hydrometrie = hydrometrie;

    if(temperature < 0 || temperature > 1) throw new MauvaiseValeurException("La temperature doit être comprise entre 0 et 1");
    this.temperature = temperature;

    if(altitude < -1 || altitude > 1) throw new MauvaiseValeurException("L'altitude doit être comprise entre -1 et 1");
    this.altitude = altitude;
    }

    public double getAltitude() {
        return altitude;
    }

    public double getHydrometrie() {
        return hydrometrie;
    }

    public double getTemperature() {
        return temperature;
    }
}
