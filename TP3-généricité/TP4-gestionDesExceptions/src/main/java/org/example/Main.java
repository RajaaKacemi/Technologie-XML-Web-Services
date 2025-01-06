package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            EntierNaturel entier = new EntierNaturel(5);
            System.out.println("Valeur initiale: " + entier.getVal());

            entier.setVal(3);
            System.out.println("Nouvelle valeur: " + entier.getVal());

            entier.decrementer();
            System.out.println("Après décrémentation: " + entier.getVal());

            entier.setVal(-12);
        } catch (NombreNegatifException e) {
            System.err.println(e.getMessage() + ". Valeur erronée: " + e.getValeurErronee());
        }
    }
}