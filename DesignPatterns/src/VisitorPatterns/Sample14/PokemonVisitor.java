package VisitorPatterns.Sample14;

/**
 * Created by Indi on 6/24/2016.
 */
public interface PokemonVisitor {
    void visit(Bulbasaur bulbasaur);
    void visit(Pokemon pokemon);
}
