package VisitorPatterns.Sample8;

/**
 * Created by Indi on 6/23/2016.
 */
public class Bulbasaur implements PokemonType {
    @Override
    public void accept(PokemonVisitor pokemonVisitor) {
        pokemonVisitor.visit(this);
    }
}
