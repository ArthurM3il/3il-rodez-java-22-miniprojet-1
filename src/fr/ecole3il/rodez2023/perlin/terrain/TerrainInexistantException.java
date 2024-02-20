package fr.ecole3il.rodez2023.perlin.terrain;

public class TerrainInexistantException extends Exception {
    public TerrainInexistantException(){
        super();
    }

    public TerrainInexistantException(String error){
        super(error);
    }
}
