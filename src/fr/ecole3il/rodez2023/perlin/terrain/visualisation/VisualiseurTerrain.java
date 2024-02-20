package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

import fr.ecole3il.rodez2023.perlin.terrain.TerrainInexistantException;
import fr.ecole3il.rodez2023.perlin.terrain.carte.Carte;
import fr.ecole3il.rodez2023.perlin.terrain.elements.TypeTerrain;

public class VisualiseurTerrain{
    private Carte carte;
    private DetermineurTerrain dt;

    public VisualiseurTerrain(DetermineurTerrain determineurTerrain, Carte carte){
        this.dt = determineurTerrain;
        this.carte = carte;
    }

    public HydrometrieAffichee getHydrometrieAffichee(int x, int y) {
        double hydro;
        try {
            hydro = carte.getTerrain(x, y).getHydrometrie();
        } catch (TerrainInexistantException e) {
            e.printStackTrace();
            return null;
        }
        if (hydro < 0.33 ) return HydrometrieAffichee.Sec;
        else if (hydro < 0.66) return HydrometrieAffichee.Moyen;
        else return HydrometrieAffichee.Humide;
    }

    public TemperatureAffichee getTemperatureAffichee(int x, int y){
        double temp;
        try {
            temp = carte.getTerrain(x, y).getHydrometrie();
        } catch (TerrainInexistantException e) {
            e.printStackTrace();
            return null;
        }
        if(temp < 0.33) return TemperatureAffichee.Froid;
        else if (temp < 0.66) return TemperatureAffichee.Temperee;
        else return TemperatureAffichee.Chaud;
    }

    public AltitudeAffichee getAltitudeAffichee(int x, int y){
        double alt;
        try {
            alt = carte.getTerrain(x, y).getHydrometrie();
        } catch (TerrainInexistantException e) {
            e.printStackTrace();
            return null;
        }
        if(alt < 0)return AltitudeAffichee.FondMarin;
        else if (alt < 0.33) return AltitudeAffichee.Basse;
        else return AltitudeAffichee.Haute ;
    }

    public TypeTerrain getTypeTerrain(int x, int y){
        double hydro;
        double temp;
        double alt;
        try {
            hydro = carte.getTerrain(x, y).getHydrometrie();
            temp = carte.getTerrain(x, y).getTemperature();
            alt = carte.getTerrain(x,y).getAltitude();
        }catch (TerrainInexistantException e){
            e.printStackTrace();
            return null;
        }
        return dt.determinerTerrain(alt,hydro,temp);
    }
}
