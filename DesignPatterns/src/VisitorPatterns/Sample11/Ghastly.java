package VisitorPatterns.Sample11;

/**
 * Created by Indi on 6/23/2016.
 */
public class Ghastly implements PokemonType {
    @Override
    public void accept(PokemonVisitor pokemonVisitor) {
        pokemonVisitor.visit(this);
    }
}
