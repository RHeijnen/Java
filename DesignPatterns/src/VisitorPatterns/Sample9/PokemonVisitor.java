package VisitorPatterns.Sample9;

/**
 * Created by Indi on 6/23/2016.
 */
public interface PokemonVisitor {
    void visit(Pickachu pickachu);
    void visit(Pokemon pokemon);
}
