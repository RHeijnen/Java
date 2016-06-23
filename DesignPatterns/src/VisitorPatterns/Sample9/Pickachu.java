package VisitorPatterns.Sample9;

/**
 * Created by Indi on 6/23/2016.
 */
public class Pickachu implements PokemonType {
    @Override
    public void accept(PokemonVisitor pokemonVisitor) {
        pokemonVisitor.visit(this);
    }
}
