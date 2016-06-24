package VisitorPatterns.Sample11;

/**
 * Created by Indi on 6/23/2016.
 */
public interface PokemonVisitor {
    void visit(Ghastly ghastly);
    void visit(Pokemon pokemon);
}
