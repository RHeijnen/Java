package VisitorPatterns.Sample12;

/**
 * Created by Indi on 6/24/2016.
 */
public interface PokemonVisitor {
    void visit(Mew mew);
    void visit(Pokemon pokemon);
}
