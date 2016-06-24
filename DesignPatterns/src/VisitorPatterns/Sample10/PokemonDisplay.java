package VisitorPatterns.Sample10;

/**
 * Created by Indi on 6/23/2016.
 */
public class PokemonDisplay implements PokemonVisitor {
    @Override
    public void visit(Pokemon pokemon) {
        System.out.println("This is an unknown pokemon");
    }

    @Override
    public void visit(Squirtle squirtle) {
        System.out.println("this is an Squirtle!");
    }
}
