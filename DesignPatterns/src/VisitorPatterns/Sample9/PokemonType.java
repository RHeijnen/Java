package VisitorPatterns.Sample9;

/**
 * Created by Indi on 6/23/2016.
 */
public interface PokemonType {
    void accept(PokemonVisitor pokemonVisitor);
}
