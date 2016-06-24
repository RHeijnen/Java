package VisitorPatterns.Sample11;

/**
 * Created by Indi on 6/23/2016.
 */
public class PokemonDisplay implements PokemonVisitor {
    @Override
    public void visit(Ghastly ghastly) {
        System.out.println("This is a ghastly!");
    }

    @Override
    public void visit(Pokemon pokemon) {
        System.out.println("Unknown pokemon!");
    }
}
