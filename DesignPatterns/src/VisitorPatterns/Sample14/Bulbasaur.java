package VisitorPatterns.Sample14;

/**
 * Created by Indi on 6/24/2016.
 */
public class Bulbasaur implements PokemonType {
    @Override
    public void accept(PokemonVisitor pokemonVisitor) {
        pokemonVisitor.visit(this);
    }
}
