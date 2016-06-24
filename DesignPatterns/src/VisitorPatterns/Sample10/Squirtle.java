package VisitorPatterns.Sample10;

/**
 * Created by Indi on 6/23/2016.
 */
public class Squirtle implements PokemonType {
    @Override
    public void accept(PokemonVisitor pokemonVisitor) {
        pokemonVisitor.visit(this);
    }
}
