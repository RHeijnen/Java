package VisitorPatterns.Sample5;

/**
 * Created by Indi on 6/23/2016.
 */
public interface PokemonVisitor   {
    void visit(Pokemon pokemon);
    void visit(Charmander charmander);
}
