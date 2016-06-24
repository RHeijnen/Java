package VisitorPatterns.Sample12;

/**
 * Created by Indi on 6/24/2016.
 */
public class Mew implements PokemonType {
    @Override
    public void accept(PokemonVisitor pokemonVisitor) {
        pokemonVisitor.visit(this);
    }
}
