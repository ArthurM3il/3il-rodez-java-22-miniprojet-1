package fr.ecole3il.rodez2023.perlin;

import fr.ecole3il.rodez2023.perlin.terrain.MauvaiseValeurException;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;
import org.junit.*;

import static org.junit.Assert.*;

public class Test {

    @org.junit.Test
    public void testMelanger(){
        int[] tabEntree = {1,2,3,4};
        int[] tab = {1,2,3,4};
        Utils.melanger(tabEntree,212123412);
        assertNotSame(tab, tabEntree);
    }

    @org.junit.Test
    public void testTerrainException() throws MauvaiseValeurException {
        Exception exception = assertThrows(MauvaiseValeurException.class, () -> {
            Terrain terrain = new Terrain(-1, 1, -9);
        });
        assertEquals("La temperature doit être comprise entre 0 et 1",exception.getMessage());
    }
}
