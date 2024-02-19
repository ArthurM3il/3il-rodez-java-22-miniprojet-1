package fr.ecole3il.rodez2023.perlin.terrain;

public class MauvaiseValeurException extends Exception {
    public MauvaiseValeurException(){
        super();
    }

    public MauvaiseValeurException(String error){
        super(error);
    }
}
