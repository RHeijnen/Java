package VisitorPatterns.Sample10;

/**
 * Created by Indi on 6/23/2016.
 */
public interface PokemonVisitor {
    void visit(Pokemon pokemon);
    void visit(Squirtle squirtle);
}
