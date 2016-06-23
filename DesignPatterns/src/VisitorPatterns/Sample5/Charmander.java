package VisitorPatterns.Sample5;

/**
 * Created by Indi on 6/23/2016.
 */
public class Charmander implements PokemonType {
    @Override
    public void accept(PokemonVisitor pokemonVisitor) {
        pokemonVisitor.visit(this);
    }
}
