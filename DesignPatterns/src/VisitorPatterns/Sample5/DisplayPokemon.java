package VisitorPatterns.Sample5;

/**
 * Created by Indi on 6/23/2016.
 */
public class DisplayPokemon implements PokemonVisitor {
    @Override
    public void visit(Pokemon pokemon) {
        System.out.println("Unknown pokemon found");
    }

    @Override
    public void visit(Charmander charmander) {
        System.out.println("This is a charmander");
    }
}
