package VisitorPatterns.Sample5;

public class Main {

    public static void main(String[] args) {

    Pokemon pokemon = new Pokemon();
    pokemon.accept(new DisplayPokemon());


    }
}
