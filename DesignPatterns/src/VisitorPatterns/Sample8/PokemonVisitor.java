package VisitorPatterns.Sample8;

/**
 * Created by Indi on 6/23/2016.
 */
public interface PokemonVisitor {
    void visit(Bulbasaur bulbasaur);
    void visit(Pokemon pokemon);
}
